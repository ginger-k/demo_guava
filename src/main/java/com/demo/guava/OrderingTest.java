package com.demo.guava;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

public class OrderingTest {

	@Test
	public void test() {
		List<String> list = Lists.newArrayList();
        list.add("peida");
        list.add("jerry");
        list.add("harry");
        list.add("eva");
        list.add("jhon");
        list.add("neron");
        
        System.out.println("list:"+ list);

	}
	
	
}
