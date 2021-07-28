package com.zhong;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/7/26 10:00
 */
public class TimeDemo {

	@Test
	public void sdf(){
		String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println(time);

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH,10);
		String format = new SimpleDateFormat("yyyy年M月dd日").format(calendar.getTime());
		System.out.println(format);

	}

	@Test
	public void StringToDate() throws ParseException {
		String time = "2021-07-26";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(time);

		String format = new SimpleDateFormat("yyyy年M月dd日").format(date);
		System.out.println(format);
	}


}
