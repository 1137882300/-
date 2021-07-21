package com.zhong;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/19 11:37
 */
public enum SortTypeEnum {
	/**
	 * 排序方式，正序
	 */
	SORT_ASC("ASC", "正序"),

	/**
	 * 排序方式，倒序
	 */
	SORT_DESC("DESC", "倒序");

	@EnumValue
	private final String order;

	private final String message;

	SortTypeEnum(String order, String message) {
		this.order = order;
		this.message = message;
	}

	public String getOrder() {
		return order;
	}

	public String getMessage() {
		return message;
	}

	public static SortTypeEnum fromOrder(String order) {
		for (SortTypeEnum sortType : SortTypeEnum.values()) {
			if (sortType.getOrder().equals(order)) {
				return sortType;
			}
		}
		return null;
	}

}



