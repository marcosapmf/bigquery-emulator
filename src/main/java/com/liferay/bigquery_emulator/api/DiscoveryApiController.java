package com.liferay.bigquery_emulator.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

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
