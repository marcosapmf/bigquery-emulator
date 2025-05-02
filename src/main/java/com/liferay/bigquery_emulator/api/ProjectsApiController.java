package com.liferay.bigquery_emulator.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import com.liferay.bigquery_emulator.exception.DatasetNotFoundException;
import com.liferay.bigquery_emulator.model.Dataset;

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
    	// TODO Auto-generated method stub
    	return ProjectsApi.super.bigqueryDatasetsInsert(projectId, alt, fields, key, oauthToken, prettyPrint, quotaUser, userIp,
    			dataset);
    }
    
    @Override
    public ResponseEntity<Dataset> bigqueryDatasetsGet(String projectId, String datasetId, @Valid String alt,
    		@Valid String fields, @Valid String key, 
    		@Valid String oauthToken, @Valid Boolean prettyPrint,
    		@Valid String quotaUser, @Valid String userIp) throws Exception {
    	// TODO Auto-generated method stub
    	
    	throw new DatasetNotFoundException("Not found: Dataset " + datasetId);
    }
    
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(_request);
    }

    @Autowired
    private NativeWebRequest _request;
}
