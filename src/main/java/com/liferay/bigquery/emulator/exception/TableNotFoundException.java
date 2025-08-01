package com.liferay.bigquery.emulator.exception;

public class TableNotFoundException extends Exception {
	public TableNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
    	return message;
	}
	
	private String message;
}
