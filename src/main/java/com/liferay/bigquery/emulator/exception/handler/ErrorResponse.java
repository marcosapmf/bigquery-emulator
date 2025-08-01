package com.liferay.bigquery.emulator.exception.handler;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
	public ErrorResponse(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@JsonProperty("error")
	public ErrorMessage getError() {
		return errorMessage;
	}
	
	private ErrorMessage errorMessage;
}
