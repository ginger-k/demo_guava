package com.demo.joda;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class FormatTest {

	
	@Test
	public void dateToString() {
		DateTime dt = new DateTime();
		
		System.out.println(dt.toString("yyyy-MM-dd HH:mm:ss"));
	
		DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(dt.toString(dtf));
	}
	
	@Test
	public void stringToDate() {
		DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
		DateTime dt = dtf.parseDateTime("2015/12/31 13:18:56");
		System.out.println(dt);
	}
	
}
