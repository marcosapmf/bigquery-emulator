package com.liferay.bigquery_emulator.exception;

public class DatasetNotFoundException extends Exception {
	
	public DatasetNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
    	return message;
	}
	
	private String message;
}
