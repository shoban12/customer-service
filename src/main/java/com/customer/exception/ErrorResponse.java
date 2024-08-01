// Custom Error Response Class
package com.customer.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

	private int statusCode;
	private String message;

	public ErrorResponse(String message) {
		super();
		this.message = message;
	}

	public ErrorResponse(int value, String message2) {
		this.statusCode = value;
		this.message = message2;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
