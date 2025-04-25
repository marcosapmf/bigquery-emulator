package com.liferay.bigquery_emulator.api;

import com.liferay.bigquery_emulator.model.Dataset;
import com.liferay.bigquery_emulator.model.DatasetList;
import com.liferay.bigquery_emulator.model.GetQueryResultsResponse;
import com.liferay.bigquery_emulator.model.GetServiceAccountResponse;
import com.liferay.bigquery_emulator.model.Job;
import com.liferay.bigquery_emulator.model.JobCancelResponse;
import com.liferay.bigquery_emulator.model.JobList;
import com.liferay.bigquery_emulator.model.ListModelsResponse;
import com.liferay.bigquery_emulator.model.ListRoutinesResponse;
import com.liferay.bigquery_emulator.model.ListRowAccessPoliciesResponse;
import com.liferay.bigquery_emulator.model.Model;
import com.liferay.bigquery_emulator.model.ProjectList;
import com.liferay.bigquery_emulator.model.QueryRequest;
import com.liferay.bigquery_emulator.model.QueryResponse;
import com.liferay.bigquery_emulator.model.Routine;
import com.liferay.bigquery_emulator.model.Table;
import com.liferay.bigquery_emulator.model.TableDataInsertAllRequest;
import com.liferay.bigquery_emulator.model.TableDataInsertAllResponse;
import com.liferay.bigquery_emulator.model.TableDataList;
import com.liferay.bigquery_emulator.model.TableList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Controller
@RequestMapping("$discovery/rest")
public class DiscoveryApiController {

    private final NativeWebRequest request;

    @GetMapping
    public ResponseEntity<String> get() throws Exception {
    	File file = ResourceUtils.getFile("discovery.json");
    	
    	StringBuilder content = new StringBuilder();
    	
        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }        
        if (content.length() > 0) {
            content.delete(content.length() - System.lineSeparator().length(), content.length());
        }
        
        return new ResponseEntity<>(content.toString(), HttpStatus.OK);
    }
    
    @Autowired
    public DiscoveryApiController(NativeWebRequest request) {
        this.request = request;
    }

}
