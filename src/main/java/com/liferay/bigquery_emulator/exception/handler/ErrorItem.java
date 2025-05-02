package com.liferay.bigquery_emulator.exception.handler;

public class ErrorItem {
	public ErrorItem(String domain, String message, String reason) {
		this.domain = domain;
		this.message = message;
		this.reason = reason;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getReason() {
		return reason;
	}
	
	private String domain;
	private String message;
	private String reason;
}
