package com.amith.personal;

public class CredentialsUnmatchException extends SecurityException {

	private static final long serialVersionUID = 2511515350517816165L;

	public CredentialsUnmatchException() {
		super();
	}

	public CredentialsUnmatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public CredentialsUnmatchException(String message) {
		super(message);
	}

	public CredentialsUnmatchException(Throwable cause) {
		super(cause);
	}

}
