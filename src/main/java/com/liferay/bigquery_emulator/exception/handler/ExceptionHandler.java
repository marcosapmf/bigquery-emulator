package com.liferay.bigquery_emulator.exception.handler;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.liferay.bigquery_emulator.exception.DatasetNotFoundException;

@ControllerAdvice
public class ExceptionHandler  extends ResponseEntityExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(DatasetNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleItemNotFound(DatasetNotFoundException datasetNotFoundException) {
    	ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND.value(), 
    		Arrays.asList(new ErrorItem("global", datasetNotFoundException.getMessage(), "notFound")), datasetNotFoundException.getMessage(), "NOT_FOUND");
    	
    	ErrorResponse error = new ErrorResponse(errorMessage);
        
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
}
