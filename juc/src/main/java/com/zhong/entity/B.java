package com.zhong.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/12 18:13
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class B {

	Integer nn;

	String ss;

}
