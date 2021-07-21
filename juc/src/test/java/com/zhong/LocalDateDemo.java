package com.zhong;

import org.junit.Test;

import java.time.*;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/2 9:59
 */
public class LocalDateDemo {
	@Test
	public void test(){

		//-999999999-01-01
		System.out.println(LocalDate.MIN);

		//+999999999-12-31
		System.out.println(LocalDate.MAX);

		LocalDate now = LocalDate.now();
		//2021-07-02
		System.out.println(now);

		LocalDate of = LocalDate.of(21, Month.AUGUST, 2);
		//0021-08-02
		System.out.println(of);

		LocalDate of1 = LocalDate.of(2022, 1, 3);
		//2022-01-03
		System.out.println(of1);

		LocalDate ofYearDay = LocalDate.ofYearDay(2021, 2);
		//2021-01-02
		System.out.println(ofYearDay);

		LocalDate epochDay = LocalDate.ofEpochDay(12346465L);
		//+35773-06-22
		System.out.println(epochDay);

		int year = ofYearDay.getYear();
		//2021
		System.out.println(year);

		int monthValue = ofYearDay.getMonthValue();
		//1
		System.out.println(monthValue);

		Month month = ofYearDay.getMonth();
		//JANUARY
		System.out.println(month);

		int dayOfYear = ofYearDay.getDayOfYear();
		//2
		System.out.println(dayOfYear);

		DayOfWeek dayOfWeek = of.getDayOfWeek();
		//MONDAY
		System.out.println(dayOfWeek);

		int lengthOfMonth = of.lengthOfMonth();
		//31
		System.out.println(lengthOfMonth);

		int lengthOfYear = of.lengthOfYear();
		//365
		System.out.println(lengthOfYear);

		LocalDate withYear = of.withYear(2021); //改年份
		//2021-08-02
		System.out.println(withYear);

		LocalDate withMonth = of.withMonth(12);//改月份
		//0021-12-02
		System.out.println(withMonth);

		LocalDate withDayOfMonth = of.withDayOfMonth(2);//改月里的日份
		//0021-08-02
		System.out.println(withDayOfMonth);

		LocalDate withDayOfYear = of.withDayOfYear(30);//改年里的日份
		//0021-01-30
		System.out.println(withDayOfYear);

		LocalDate plusYears = withDayOfMonth.plusYears(321);// +年
		//0342-08-02
		System.out.println(plusYears);

		LocalDate minusMonths = plusYears.minusMonths(5);// -月
		//0342-03-02
		System.out.println(minusMonths);

		LocalDateTime atTime = minusMonths.atTime(LocalTime.now());
		//0342-03-02T10:31:41.472
		System.out.println(atTime);

	}

}
