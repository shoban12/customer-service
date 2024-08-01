// Creating a custom exception that can be thrown when a user tries to update/delete a customer that doesn't exist
package com.customer.exception;

public class NoSuchCustomerExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7223490078577622639L;
	private String message;

	public NoSuchCustomerExistsException() {
	}

	public NoSuchCustomerExistsException(String msg) {
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
