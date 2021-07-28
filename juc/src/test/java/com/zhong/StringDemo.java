package com.zhong;

import org.junit.Test;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/27 19:58
 */
public class StringDemo {

	@Test
	public void subString(){
		String s = "as-da-sd-AA-AA-FFF-FF";

		String sss = s.substring(s.indexOf("-") + 1);
		System.out.println(sss);

	}

}
