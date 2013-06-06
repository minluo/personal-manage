package com.amith.personal.webapp.dto;


/**
 * 简单结果对象
 * 
 * @author amith
 * 
 */
public class ResultDto {

	private boolean result;

	public static ResultDto createSuccess() {
		return new ResultDto(true);
	}
	
	public static ResultDto createFailure() {
		return new ResultDto(false);
	}
	
	protected ResultDto(boolean result) {
		this.result = result;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
}
