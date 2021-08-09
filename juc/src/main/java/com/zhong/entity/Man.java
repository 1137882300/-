package com.zhong.entity;

import com.zhong.enums.BizEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/5 16:46
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Man {

	private Integer id;
	private BizEnum sex;

}
