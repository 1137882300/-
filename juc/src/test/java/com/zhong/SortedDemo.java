package com.zhong;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/2 15:58
 */
public class SortedDemo {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("3");
		list1.add("2");
		list1.add("1");
		list1.add("4");
		list1.add("5");

		List<String> list2 = new ArrayList<>();
		list2.add("5");
		list2.add("4");

//		List<String> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect(toList());
//		System.out.println("---差集 reduce1 (list1 - list2)---");
//		reduce1.parallelStream().forEach(System.out :: println);


		System.out.println(list1);
		List<String> collect = list1.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(toList());//默认是 从小到大
		System.out.println(collect);

	}
}
