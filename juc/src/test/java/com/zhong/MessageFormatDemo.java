package com.zhong;

import org.junit.Test;

import java.text.MessageFormat;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/1 14:31
 */
public class MessageFormatDemo {

	@Test
	public void test(){
		String msg = "{0}{1}{2}{3}{4}{5}{6}{7}{8}";
		Object [] array = new Object[]{"A","B","C","D","E","F","G","H","I",};
		String value = MessageFormat.format(msg, array);

		System.out.println(value);  // 输出：ABCDEFGHI
	}

	@Test
	public void test2(){
		String value = MessageFormat.format("oh, {0} is 'a' pig", "ZhangSan");
		System.out.println(value);  // 输出：oh, ZhangSan is a pig

		String value2 = MessageFormat.format("oh, {0} is a pig", "ZhangSan");
		System.out.println(value2);  // 输出：oh, ZhangSan is a pig

		String value3 = MessageFormat.format("biden: ''{0}'' is 'a' pig", "ZhangSan");
		System.out.println(value3);  // 输出：

		String value4 = MessageFormat.format("oh, {0} is \"a\" pig", "ZhangSan");
		System.out.println(value4);  // 输出：
	}

	@Test
	public void test3(){
		// 单引号会使其后面的占位符均失效，导致直接输出占位符
		MessageFormat.format("{0}{1}", 1, 2); // 结果12
		MessageFormat.format("'{0}{1}", 1, 2); // 结果{0}{1}
		MessageFormat.format("'{0}'-{1}", 1, 2); // 结果{0}-2.
		System.out.println();
	}


	@Test
	public void test4(){
		String message = "oh, {0} is a pig,so {1}";
		MessageFormat messageFormat = new MessageFormat(message);
		Object[] array = new Object[]{"ZhangSan","biden"};
		String value = messageFormat.format(array);

		System.out.println(value);

	}
}
