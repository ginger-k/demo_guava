package com.demo.guava;

import org.junit.Test;

import com.google.common.base.Optional;

public class OptionalTest {

	@Test
	public void ofTest() {
		/*
		 * Optional.of(T)：获得一个Optional对象，其内部包含了一个非null的T数据类型实例，
		 * 若T=null，则立刻报错。
		 */
		Optional<Integer> opt = Optional.of(33);
		System.out.println(opt.get());

		Optional<String> opt2 = Optional.of(null);
		System.out.println(opt2.get());
	}
	
	@Test
	public void absentTest() {
		/*
		 * Optional.absent()：获得一个Optional对象，其内部包含了空值
		 * 调用get时会报错
		 */
		Optional<Object> opt = Optional.absent();
		System.out.println(opt.isPresent());
		System.out.println(opt.get());
	}
	
}
