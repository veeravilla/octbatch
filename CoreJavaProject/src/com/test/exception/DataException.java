package com.test.exception;

public class DataException extends Exception {
	private String errCode;
	private String errMsg;

	
	public DataException(String errCode, String errMsg) {
		super("errCode : " + errCode + " errMsg : " + errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
