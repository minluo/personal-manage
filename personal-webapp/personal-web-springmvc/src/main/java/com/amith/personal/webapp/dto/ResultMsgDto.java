package com.amith.personal.webapp.dto;

/**
 * 简单文本结果对象
 * 
 * @author amith
 * 
 */
public class ResultMsgDto extends ResultDto {

	private String msg;

	public static ResultMsgDto createSuccess(String msg) {
		return new ResultMsgDto(true, msg);
	}
	
	public static ResultMsgDto createFailure(String msg) {
		return new ResultMsgDto(false, msg);
	}
	
	public ResultMsgDto(boolean result, String msg) {
		super(result);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
