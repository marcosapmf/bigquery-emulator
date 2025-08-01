package com.liferay.bigquery.emulator.exception.handler;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessage {
    public ErrorMessage(int code, List<ErrorItem> errorItems, String message, String status) {
        this.code = code;
        this.errorItems = errorItems;
        this.message = message;
        this.status = status;
    }

    public int getCode() {
        return code;
    }
    
    @JsonProperty("errors")
    public List<ErrorItem> getErrorItems() {
    	return errorItems;
    }

    public String getMessage() {
        return message;
    }
    
    public String getStatus() {
        return status;
    }
    
    private int code;
    private List<ErrorItem> errorItems;
    private String message;
    private String status;
}
