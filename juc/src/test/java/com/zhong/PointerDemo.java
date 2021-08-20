package com.zhong;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.google.common.collect.Lists;
import com.zhong.entity.A;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/12 18:12
 */
public class PointerDemo {

	@Test
	public void test(){
		A a = new A();
		a.setNn(10);
		a.setSs("qqqq");

		this.aValue(a);

		System.out.println(a);

	}


	public void aValue(A a){
		a.setSs("12");
		a.setNn(18);
	}


	@Test
	public void remove(){
	 List<Integer> list = Lists.newArrayList(1, 2, 3, 4);

		List<Integer> collect = list.stream().filter(s -> !s.equals(2)).collect(Collectors.toList());
		System.out.println(collect);

	}

}
