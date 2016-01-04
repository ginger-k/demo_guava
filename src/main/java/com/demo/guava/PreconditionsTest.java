package com.demo.guava;

import org.junit.Test;

import com.google.common.base.Preconditions;

public class PreconditionsTest {

	@Test
	public void test() {
		try {
			String name = " ";
			Preconditions.checkNotNull(name, "参数不能为null");
			Preconditions.checkArgument(name.trim().length() > 0, "参数不能为空");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int age = 0;
			Preconditions.checkArgument(age > 0, "age必须大于0");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
