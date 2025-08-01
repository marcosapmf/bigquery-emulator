package com.liferay.bigquery.emulator.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.liferay.bigquery.emulator.database.creator.DatabaseManager;
import com.liferay.bigquery.emulator.exception.DatasetNotFoundException;
import com.liferay.bigquery.emulator.exception.TableNotFoundException;
import com.liferay.bigquery.emulator.job.JobManager;
import com.liferay.bigquery.emulator.model.Dataset;
import com.liferay.bigquery.emulator.model.DatasetReference;
import com.liferay.bigquery.emulator.model.ErrorProto;
import com.liferay.bigquery.emulator.model.GetQueryResultsResponse;
import com.liferay.bigquery.emulator.model.Job;
import com.liferay.bigquery.emulator.model.JobConfiguration;
import com.liferay.bigquery.emulator.model.JobConfigurationQuery;
import com.liferay.bigquery.emulator.model.JobList;
import com.liferay.bigquery.emulator.model.JobReference;
import com.liferay.bigquery.emulator.model.JobStatistics;
import com.liferay.bigquery.emulator.model.JobStatistics2;
import com.liferay.bigquery.emulator.model.JobStatus;
import com.liferay.bigquery.emulator.model.QueryRequest;
import com.liferay.bigquery.emulator.model.QueryResponse;
import com.liferay.bigquery.emulator.model.SessionInfo;
import com.liferay.bigquery.emulator.model.Table;
import com.liferay.bigquery.emulator.model.TableCell;
import com.liferay.bigquery.emulator.model.TableDataInsertAllRequest;
import com.liferay.bigquery.emulator.model.TableDataInsertAllResponse;
import com.liferay.bigquery.emulator.model.TableFieldSchema;
import com.liferay.bigquery.emulator.model.TableReference;
import com.liferay.bigquery.emulator.model.TableRow;
import com.liferay.bigquery.emulator.model.TableSchema;
import com.liferay.bigquery.emulator.parser.SQLRowSetParser;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-25T13:50:41.257366434-03:00[America/Recife]", comments = "Generator version: 7.9.0")
@Controller
@RequestMapping("${openapi.bigQuery.base-path:/bigquery/v2}")
public class ProjectsApiController implements ProjectsApi {

    @Override
    public ResponseEntity<Dataset> bigqueryDatasetsInsert(
    		String projectId,
    		@Valid String alt, @Valid String fields,
    		@Valid String key, @Valid String oauthToken,
    		@Valid Boolean prettyPrint, @Valid String quotaUser,
    		@Valid String userIp, @Valid Dataset dataset) {
		DatasetReference datasetReference = dataset.getDatasetReference();
		
		_databaseManager.createDataset(datasetReference.getDatasetId());
    	
    	return ResponseEntity.ok(dataset);
    }
    
    @Override
    public ResponseEntity<Dataset> bigqueryDatasetsGet(String projectId, String datasetId, @Valid String alt,
    		@Valid String fields, @Valid String key, 
    		@Valid String oauthToken, @Valid Boolean prettyPrint,
    		@Valid String quotaUser, @Valid String userIp) throws Exception {    	
    	Dataset dataset = _databaseManager.getDataset(datasetId, projectId);
    	
    	if (dataset != null) {
    		return ResponseEntity.ok(dataset);
    	}
    	
    	throw new DatasetNotFoundException("Not found: Dataset " + datasetId);
    }
    
    @Override
    public ResponseEntity<Table> bigqueryTablesInsert(String projectId, String datasetId, @Valid String alt,
    		@Valid String fields, @Valid String key, @Valid String oauthToken, @Valid Boolean prettyPrint,
    		@Valid String quotaUser, @Valid String userIp, @Valid Table table) {
		TableReference tableReference = table.getTableReference();
		
		TableSchema tableSchema = table.getSchema();
		
		_databaseManager.createTable(
				tableReference.getDatasetId(),
				tableReference.getProjectId(),
				tableSchema,tableReference.getTableId());
		
		return ResponseEntity.ok(table);
    }
    
    @Override
    public ResponseEntity<GetQueryResultsResponse> bigqueryJobsGetQueryResults(String projectId, String jobId,
    		@Valid String alt, @Valid String fields, @Valid String key, @Valid String oauthToken,
    		@Valid Boolean prettyPrint, @Valid String quotaUser, @Valid String userIp, @Valid String location,
    		@Valid Integer maxResults, @Valid String pageToken, @Valid String startIndex, @Valid Integer timeoutMs) {
    	return ResponseEntity.ok(JobManager.getGetQueryResultsResponse(jobId));
    }
    
	@Override
    public ResponseEntity<Job> bigqueryJobsGet(String projectId, String jobId, @Valid String alt, @Valid String fields,
    		@Valid String key, @Valid String oauthToken, @Valid Boolean prettyPrint, @Valid String quotaUser,
    		@Valid String userIp, @Valid String location) {
		Job job = JobManager.getJob(jobId);
		
		JobConfiguration jobConfiguration = job.getConfiguration();
		
		JobConfigurationQuery jobConfigurationQuery = jobConfiguration.getQuery();
		
    	return ResponseEntity.ok(JobManager.addGetQueryResultsResponse(jobId, 
    			SQLRowSetParser.parseToGetQueryResultsResponse(
    				_databaseManager.executeQuery(
    					jobConfigurationQuery.getQuery()))));
    }

    @Override
    public ResponseEntity<Job> bigqueryJobsInsert(String projectId, @Valid String alt, @Valid String fields,
    		@Valid String key, @Valid String oauthToken, @Valid Boolean prettyPrint, @Valid String quotaUser,
    		@Valid String userIp, @Valid Job job) {    
    	return ResponseEntity.ok(JobManager.addJob(job));
    }
    
    @Override
    public ResponseEntity<Table> bigqueryTablesGet(String projectId, String datasetId, String tableId,
    		@Valid String alt, @Valid String fields, @Valid String key, @Valid String oauthToken,
    		@Valid Boolean prettyPrint, @Valid String quotaUser, @Valid String userIp, @Valid String selectedFields,
    		@Valid String view) throws Exception {
    	Table table = _databaseManager.getTable(datasetId, projectId, tableId);
    	
    	if (table != null) {
    		return ResponseEntity.ok(table);
    	}
    	
    	throw new TableNotFoundException("Not found: Table " + tableId);
    }
    
    @Override
    public ResponseEntity<TableDataInsertAllResponse> bigqueryTabledataInsertAll(String projectId, String datasetId,
    		String tableId, @Valid String alt, @Valid String fields, @Valid String key, @Valid String oauthToken,
    		@Valid Boolean prettyPrint, @Valid String quotaUser, @Valid String userIp,
    		@Valid TableDataInsertAllRequest tableDataInsertAllRequest) {
    	_databaseManager.insertTableData(datasetId, projectId, tableDataInsertAllRequest, tableId);
    	
    	return ResponseEntity.ok(new TableDataInsertAllResponse());
    }
    
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(_request);
    }

    @Autowired
    private DatabaseManager _databaseManager;

    @Autowired
    private NativeWebRequest _request;
}
