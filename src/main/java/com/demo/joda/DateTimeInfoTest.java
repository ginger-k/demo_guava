package com.demo.joda;

import org.joda.time.DateTime;
import org.junit.Test;

public class DateTimeInfoTest {

	@Test
	public void basicInfoTest() {
		DateTime dt = new DateTime(2015, 12, 31, 12, 00, 00);
		System.out.println("年：" + dt.getYear());
		System.out.println("月：" + dt.getMonthOfYear());
		System.out.println("日：" + dt.getDayOfMonth());
		System.out.println("星期：" + dt.getDayOfWeek());
		System.out.println("时：" + dt.getHourOfDay());
		System.out.println("分：" + dt.getMinuteOfHour());
		System.out.println("秒：" + dt.getSecondOfMinute());
	}
	
	@Test
	public void weekInfoTest() {
		DateTime dt = new DateTime(2015, 12, 31, 12, 00, 00);
		//2015-12-31 星期4
		System.out.println("2015年12月31日是 " + dt.getWeekyear() + " 年的第 " + dt.getWeekOfWeekyear() + " 周");
		//2016-01-01 星期7, at least 4 days are in the year
		DateTime dt2 = dt.plusDays(3);
		System.out.println("2016年01月01日是 " + dt2.getWeekyear() + " 年的第 " + dt2.getWeekOfWeekyear() + " 周");
		//2016-01-07 星期4
		DateTime dt3 = dt.plusWeeks(1);
		System.out.println("2016年01月07日是 " + dt3.getWeekyear() + " 年的第 " + dt3.getWeekOfWeekyear() + " 周");
	}
	
	
}
