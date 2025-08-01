package com.liferay.bigquery.emulator.parser;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;

import com.liferay.bigquery.emulator.job.JobManager;
import com.liferay.bigquery.emulator.model.GetQueryResultsResponse;
import com.liferay.bigquery.emulator.model.TableCell;
import com.liferay.bigquery.emulator.model.TableFieldSchema;
import com.liferay.bigquery.emulator.model.TableRow;
import com.liferay.bigquery.emulator.model.TableSchema;

public class SQLRowSetParser {

	public static GetQueryResultsResponse parseToGetQueryResultsResponse(SqlRowSet sqlRowSet) {
		if (sqlRowSet == null) {
            throw new IllegalArgumentException("SqlRowSet cannot be null.");
        }
		
		GetQueryResultsResponse getQueryResultsResponse = new GetQueryResultsResponse();
		
		getQueryResultsResponse.setJobComplete(true);
		
		getQueryResultsResponse.setRows(_parseToTableRows(sqlRowSet));
		getQueryResultsResponse.setSchema(_parseToTableSchema(sqlRowSet));
		
		return getQueryResultsResponse;
	}
	
	private static List<TableRow> _parseToTableRows(SqlRowSet sqlRowSet) {
		List<TableRow> tableRows = new ArrayList<TableRow>();
		
		SqlRowSetMetaData sqlRowSetMetaData = sqlRowSet.getMetaData();
		
		while (sqlRowSet.next()) {
			TableRow tableRow = new TableRow();

			for (int i = 1; i <= sqlRowSetMetaData.getColumnCount(); i++) {
	            
				TableCell tableCell = new TableCell();
				
				tableCell.setV(sqlRowSet.getObject(i));

				tableRow.addFItem(tableCell);
			}
			
			tableRows.add(tableRow);
		}
		
		return tableRows;
	}
	
	private static TableSchema _parseToTableSchema(SqlRowSet sqlRowSet) {
		TableSchema tableSchema = new TableSchema();

		SqlRowSetMetaData sqlRowSetMetaData = sqlRowSet.getMetaData();
		
		for (int i = 1; i <= sqlRowSetMetaData.getColumnCount(); i++) {
            TableFieldSchema tableFieldSchema = new TableFieldSchema();
            
            tableFieldSchema.setMode("NULLABLE");
            tableFieldSchema.setName(sqlRowSetMetaData.getColumnName(i));
            tableFieldSchema.setType(mapJdbcTypeToBigQueryType(sqlRowSetMetaData.getColumnType(i)));
            
            tableSchema.addFieldsItem(tableFieldSchema);
		}
		
		return tableSchema;
	}
	
    private static String mapJdbcTypeToBigQueryType(int jdbcType) {
        switch (jdbcType) {
            case Types.BIGINT:
            case Types.INTEGER:
            case Types.SMALLINT:
            case Types.TINYINT:
                return "INT64";
            case Types.BOOLEAN:
                return "BOOL";
            case Types.BINARY:
            case Types.VARBINARY:
            case Types.LONGVARBINARY:
                return "BYTES";
            case Types.DATE:
                return "DATE";
            case Types.DOUBLE:
            case Types.FLOAT:
            case Types.REAL:
                return "FLOAT64";
            case Types.NUMERIC:
            case Types.DECIMAL:
                return "BIGNUMERIC";
            case Types.CHAR:
            case Types.VARCHAR:
            case Types.LONGVARCHAR:
            case Types.NCHAR:
            case Types.NVARCHAR:
            case Types.LONGNVARCHAR:
            case Types.CLOB:
            case Types.NCLOB:
            case Types.SQLXML:
                return "STRING";
            case Types.TIMESTAMP:
            case Types.TIMESTAMP_WITH_TIMEZONE:
                return "TIMESTAMP";
            case Types.ARRAY:
            case Types.STRUCT:
            case Types.JAVA_OBJECT:
            default:
                return "STRING";
        }
    }
}
