package com.demo.joda;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class ConstructorTest {

	@Test
	public void constructorTest() {
		DateTime dt1 = new DateTime();
		System.out.println(dt1);
		
		DateTime dt2 = new DateTime(System.currentTimeMillis());
		System.out.println(dt2);
		
		DateTime dt3 = new DateTime(new Date());
		System.out.println(dt3);
		
		DateTime dt4 = new DateTime(2015, 12, 31, 11, 41, 12);
		System.out.println(dt4);
		
		DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		DateTime dt5 = dtf.parseDateTime("2015-12-31 13:11:11");
		System.out.println(dt5);
	}
	
	
}
