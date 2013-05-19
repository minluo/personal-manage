package com.amith.personal;

public class UserUnusableException extends SecurityException {

	private static final long serialVersionUID = 8244977200447441097L;

	public UserUnusableException() {
		super();
	}

	public UserUnusableException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserUnusableException(String message) {
		super(message);
	}

	public UserUnusableException(Throwable cause) {
		super(cause);
	}

}
