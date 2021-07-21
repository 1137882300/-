package com.zhong;

import org.junit.Test;

import java.time.Month;
import java.time.MonthDay;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/1 15:06
 *
 * 只有：月日
 *
 */
public class MonthDayDemo {

	@Test
	public void test() {
		MonthDay now = MonthDay.now();
		//--07-02
		System.out.println(now);

		MonthDay of = MonthDay.of(Month.MAY, 2);
		//--05-02
		System.out.println(of);

		MonthDay of1 = MonthDay.of(7, 9);
		//--07-09
		System.out.println(of1);

		int monthValue = of1.getMonthValue();
		//7
		System.out.println(monthValue);

		int dayOfMonth = of1.getDayOfMonth();
		//9
		System.out.println(dayOfMonth);

		Month month = of1.getMonth();
		//JULY
		System.out.println(month);

	}

}
