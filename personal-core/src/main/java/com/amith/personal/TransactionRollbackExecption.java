package com.amith.personal;

/**
 * 事务回滚异常
 * 
 * @author amith
 * 
 */
public class TransactionRollbackExecption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TransactionRollbackExecption() {
		super();
	}

	public TransactionRollbackExecption(String message, Throwable cause) {
		super(message, cause);
	}

	public TransactionRollbackExecption(String message) {
		super(message);
	}

	public TransactionRollbackExecption(Throwable cause) {
		super(cause);
	}
	
}
