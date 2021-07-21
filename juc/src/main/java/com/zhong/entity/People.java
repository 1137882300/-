package com.zhong.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.zhong.enums.BizEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/2 10:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class People {

	@JSONField(name = "id")
	private Long id;

	@JSONField(name = "peopleName")
	private String name;

	@JSONField(name = "high")
	private Integer high;

	@JSONField(name = "sex")
	private BizEnum sex;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date date;

	@Builder.Default
	private boolean required = true;
	@Builder.Default
	private Object defaultValue = null;

}
