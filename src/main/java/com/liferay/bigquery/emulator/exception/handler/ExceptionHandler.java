package com.liferay.bigquery.emulator.exception.handler;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.liferay.bigquery.emulator.exception.DatasetNotFoundException;
import com.liferay.bigquery.emulator.exception.TableNotFoundException;

@ControllerAdvice
public class ExceptionHandler  extends ResponseEntityExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(DatasetNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleDatasetNotFound(DatasetNotFoundException datasetNotFoundException) {
    	ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND.value(), 
    		Arrays.asList(new ErrorItem("global", datasetNotFoundException.getMessage(), "notFound")), datasetNotFoundException.getMessage(), "NOT_FOUND");
    	
    	ErrorResponse error = new ErrorResponse(errorMessage);
        
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
	
	@org.springframework.web.bind.annotation.ExceptionHandler(TableNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTableNotFound(TableNotFoundException tableNotFoundException) {
    	ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND.value(), 
    		Arrays.asList(new ErrorItem("global", tableNotFoundException.getMessage(), "notFound")), tableNotFoundException.getMessage(), "NOT_FOUND");
    	
    	ErrorResponse error = new ErrorResponse(errorMessage);
        
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
}
