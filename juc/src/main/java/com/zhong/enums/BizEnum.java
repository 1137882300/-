package com.zhong.enums;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/2 11:00
 */
public enum BizEnum {

	male(1,"男人"),
	female(0,"女人"),

	;

	private Integer code;
	private String description;

	BizEnum(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
