package com.liferay.bigquery_emulator.database.creator;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.liferay.bigquery_emulator.model.Dataset;
import com.liferay.bigquery_emulator.model.DatasetReference;
import com.liferay.bigquery_emulator.model.EncryptionConfiguration;
import com.liferay.bigquery_emulator.model.Table;
import com.liferay.bigquery_emulator.model.TableDataInsertAllRequest;
import com.liferay.bigquery_emulator.model.TableDataInsertAllRequestRowsInner;
import com.liferay.bigquery_emulator.model.TableFieldSchema;
import com.liferay.bigquery_emulator.model.TableSchema;

import jakarta.validation.Valid;

@Component
public class DatabaseManager {
	
	@Transactional
    public void createDataset(String datasetId) {
        if (datasetId == null || datasetId.trim().isEmpty()) {
            throw new IllegalArgumentException("Database name cannot be null or empty.");
        }

        _execute("CREATE SCHEMA IF NOT EXISTS " + datasetId);
    }
	
	public void createTable(String datasetId, String projectId, TableSchema tableSchema, String tableId) {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(String.format("CREATE TABLE %s.%s (", datasetId, tableId));
		
		List<@Valid TableFieldSchema> fields = tableSchema.getFields();

		stringBuilder.append(
			String.join(
				",",
				fields
					.stream()
					.map(field -> field.getName() + " " + _fieldTypes.getOrDefault(field.getType(), field.getType()) )
					.collect(Collectors.toList())));
		
		stringBuilder.append(");");
		
		_execute(stringBuilder.toString());
	}
	
	public SqlRowSet executeQuery(String sql) {
		return _jdbcTemplate.queryForRowSet(sql);
	}
	
	public Dataset getDataset(String datasetId, String projectId) {
		List<Long> results = _jdbcTemplate.query(
			String.format(
				"SELECT 1 FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = '%s';", datasetId), 
			(rs, rowNum) -> rs.getLong(1));
		
		if (results.size() == 0) {
			return null;
		}
		
		Dataset dataset = new Dataset();
		
		Date date = new Date();

		dataset.setCreationTime(String.valueOf(date.getTime()));

		DatasetReference datasetReference = new DatasetReference();
		
		datasetReference.setDatasetId(datasetId);
		datasetReference.setProjectId(projectId);
		
		dataset.setDatasetReference(datasetReference);
		
		EncryptionConfiguration defaultEncryptionConfiguration = new EncryptionConfiguration();
		
		defaultEncryptionConfiguration.setKmsKeyName(_DEFAULT_DATASET_ENCRYPTION_CONFIGURATION_KMS_KEY_NAME);

		dataset.setDefaultEncryptionConfiguration(defaultEncryptionConfiguration);
		dataset.setLastModifiedTime(String.valueOf(date.getTime()));
		
		return dataset;
	}

	public Table getTable(String datasetId, String projectId, String tableId) {
		List<Long> results = _jdbcTemplate.query(String.format(
			"SELECT 1 FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = '%s' AND TABLE_SCHEMA = '%s'",
			tableId, datasetId), (rs, rowNum) -> rs.getLong(1));
		
		if (results.size() == 0) {
			return null;			
		}
		
		Table table = new Table();
		
		Date date = new Date();
		
		table.setCreationTime(String.valueOf(date.getTime()));
		table.setLastModifiedTime(String.valueOf(date.getTime()));
		
		table.setId(tableId);
		
		return table;
	}
	
	public void insertTableData(String datasetId, String projectId, TableDataInsertAllRequest tableDataInsertAllRequest, String tableId) {
		
		List<TableDataInsertAllRequestRowsInner> tableDataInsertAllRequestRowsInners = tableDataInsertAllRequest.getRows();
		
		List<String> sqlStatements = new ArrayList<String>();
		
		for (TableDataInsertAllRequestRowsInner tableDataInsertAllRequestRowsInner : tableDataInsertAllRequestRowsInners) {
			
			Map<String, Object> json = tableDataInsertAllRequestRowsInner.getJson();
			
			StringBuilder sb = new StringBuilder();

			sb.append("INSERT INTO %s.%s.%s (");

			sb.append(String.join(",", json.keySet()));

			sb.append(") VALUES (");
			
			sb.append(String.join(",", json.values()
					.stream()
					.map(i -> {
						if (i instanceof String) {
							return "'" + i + "'";
						}

						return i.toString();
					})
					.collect(Collectors.toList())));
			
			sb.append(")");
			
			sqlStatements.add(String.format(sb.toString(), datasetId, projectId, tableId));
		}
		
		_jdbcTemplate.batchUpdate(sqlStatements.toArray(String[]::new));	
	}
	
	private void _execute(String sql) {
		try {
			_jdbcTemplate.execute(sql);
		} catch (Exception e) {
			//throw e;
			//TODO log it!
		}
	}
	
	private final static String _DEFAULT_DATASET_ENCRYPTION_CONFIGURATION_KMS_KEY_NAME = "kmsKeyName";

	@Autowired
	private JdbcTemplate _jdbcTemplate;
	
	private Map<String, String> _fieldTypes = new HashMap<>() {{
		put("INT64", "BIGINT");
		put("FLOAT64", "DOUBLE PRECISION");
		put("DECIMAL", "NUMERIC");
		put("BIGNUMERIC", "NUMERIC");
		put("BOOL", "BOOLEAN");
		put("STRING", "TEXT");
		put("BYTES", "BYTEA");
		put("DATETIME", "TIMESTAMP WITHOUT TIME ZONE");
		put("TIMESTAMP", "TIMESTAMP WITH TIME ZONE");
		put("TIME", "TIMESTAMP WITHOUT TIME ZONE");
		put("JSON", "JSONB");
		put("ARRAY", "TEXT[]");
		put("STRUCT", "JSONB");
	}};
	
	
	
}
