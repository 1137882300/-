package com.zhong;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/22 16:03
 */
public class CalendarDemo {

	@Test
	public void testTime(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		Date dateStart = cal.getTime();
		System.out.println(dateStart);

		cal.setTime(new Date());
		System.out.println(cal.getTime());

	}

	@Test
	public void testTime2(){
		Date now = new Date();
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(now);
// 将时分秒,毫秒域清零
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		System.out.println(cal1.getTime());
	}

	@Test
	public void Time3(){
		int datTime = 3;
		Calendar cal = Calendar.getInstance();

		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
//		Date startDate = cal.getTime();
//		System.out.println(startDate);
		System.out.println(cal.getTime());


		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),23, 59, 59);
		cal.set(Calendar.MILLISECOND,0);
//		if (datTime < 0){
//			cal.add(Calendar.DATE, datTime);
//		}else {
//			cal.add(Calendar.DATE, datTime-1);
//		}

		cal.add(Calendar.DATE, datTime > 0 ? datTime-1 : datTime);

		Date time = cal.getTime();
		System.out.println(time);
	}

	@Test
	public void test4(){
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.MILLISECOND,0);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),0, 0, 0);
		Date startDate = cal.getTime();
		System.out.println(startDate);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),23, 59, 59);
		System.out.println(cal.getTime());
	}

	@Test
	public void test5(){
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		sdf.format(date);

		Calendar cal = Calendar.getInstance();
//		cal.setTime(enterpriseDeploy.getValidEndTime());
//		cal.add(Calendar.DATE,request.getEditTime());
		Date endDate = cal.getTime();
		System.out.println(endDate);

		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),0, 0, 0);
		System.out.println(cal.getTime());
	}

	@Test
	public void test6(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.HOUR_OF_DAY,23);
		cal.set(Calendar.MINUTE,59);
		cal.set(Calendar.SECOND,59);
		cal.set(Calendar.MILLISECOND,0);
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.getTime());

		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		if(fmt.format(new Date()).equals(fmt.format(new Date()))){
			System.out.println("111");
		}

	}

}
