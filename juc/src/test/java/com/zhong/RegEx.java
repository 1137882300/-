package com.zhong;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/8/18 16:09
 */
public class RegEx {


	@Test
	public void test(){
		String regEx = "/[^\\a-\\z\\A-\\Z0-9\\u4E00-\\u9FA5]/g\n";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher("request.getRealName()");
		boolean b = matcher.find();
		System.out.println(b);
	}

}
