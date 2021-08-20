package com.zhong.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;




/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/11 14:13
 */
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Array {

	private List<String> userids;




}


