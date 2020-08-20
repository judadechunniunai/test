package com.zhihuittu.sunbz.entity;


/**
 * 公共响应封装类
 */
public class Rsp {
	public static final String SUCCESS_CODE = "1";
	public static final String FAIL_CODE = "0";

	private String code = "1";
	private String msg = "成功";
	private Object data;

	public Rsp() {

	}

	public Rsp(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Rsp(String code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
