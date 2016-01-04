package com.demo.joda;

import org.joda.time.DateTime;
import org.junit.Test;

public class CalculateTest {
	
	@Test
	public void calculateTest() {
		DateTime now = new DateTime();
		//五年前第二个月的最后一天
		DateTime then = now.minusYears(5)
							.monthOfYear().setCopy(2)
							.dayOfMonth().withMaximumValue();
		System.out.println(then.toString("yyyy-MM-dd HH:mm:ss"));
		
		//上周五的日期
		DateTime previousFriday = now.minusWeeks(1)
									.dayOfWeek().setCopy(5);
		System.out.println(previousFriday.toString("yyyy-MM-dd"));
	}

}
