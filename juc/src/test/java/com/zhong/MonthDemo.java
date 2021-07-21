package com.zhong;

import org.junit.Test;

import java.time.Month;
import java.time.MonthDay;
import java.util.Arrays;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/2 9:34
 */
public class MonthDemo {

	@Test
	public void test(){
		Month of = Month.of(10);
		//OCTOBER
		System.out.println(of);

		Month[] values = Month.values();
		//[JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER]
		System.out.println(Arrays.asList(values));

		Month ni = Month.valueOf("AUGUST");
		//AUGUST
		System.out.println(ni);

		Month plus = of.plus(5);
		//MARCH
		System.out.println(plus);

		Month minus = of.minus(10);
		//DECEMBER
		System.out.println(minus);

		int length = of.length(true);
		//31
		System.out.println(length);

		int minLength = of.minLength();
		//31
		System.out.println(minLength);

		int maxLength = of.maxLength();
		//31
		System.out.println(maxLength);

		int firstDayOfYear = of.firstDayOfYear(false);//某月第一天在某年第几天
		//274
		System.out.println(firstDayOfYear);

		Month firstMonthOfQuarter = of.firstMonthOfQuarter();//基月的季度第一个月
		//OCTOBER
		System.out.println(firstMonthOfQuarter);

	}


}
