package com.zhong;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/29 15:40
 */
public class UtilsDemo {


	@Test
	public void disjoint(){


		List<Integer> list1 = Lists.newArrayList(1, 2, 3, 4, 5);


		List<Integer> list2 = Lists.newArrayList(9, 8, 3, 4, 10);


		boolean disjoint = Collections.disjoint(list1, list2); //不相交


		System.out.println(disjoint);


	}



}
