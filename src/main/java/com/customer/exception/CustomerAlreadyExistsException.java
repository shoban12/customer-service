// Creating a custom exception that can be thrown when a user tries to add a customer that already exists
package com.customer.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4544131164664303256L;
	private String message;

	public CustomerAlreadyExistsException() {
	}

	public CustomerAlreadyExistsException(String msg) {
		super(msg);
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
