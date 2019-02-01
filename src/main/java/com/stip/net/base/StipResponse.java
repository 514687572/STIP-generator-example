package com.stip.net.base;

public class StipResponse {
	
	private int status;
	
	private String msg;
	
	private Object data;
	
	public static StipResponse success(String message){
		StipResponse stipResponse = new StipResponse();
		stipResponse.setStatus(200);
		stipResponse.setMsg(message);
		return stipResponse;
	}
	
	public static StipResponse success(String message, Object resultObject){
		StipResponse stipResponse = new StipResponse();
		stipResponse.setStatus(200);
		stipResponse.setMsg(message);
		stipResponse.setData(resultObject);
		return stipResponse;
	}
	
	public static StipResponse error(String message){
		StipResponse stipResponse = new StipResponse();
		stipResponse.setStatus(500);
		stipResponse.setMsg(message);
		return stipResponse;
	}

	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	
	

}
