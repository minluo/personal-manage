package com.amith.personal;

public class UserNotActivatedException extends SecurityException {

	private static final long serialVersionUID = 8244977200447441097L;

	public UserNotActivatedException() {
		super();
	}

	public UserNotActivatedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotActivatedException(String message) {
		super(message);
	}

	public UserNotActivatedException(Throwable cause) {
		super(cause);
	}

}
