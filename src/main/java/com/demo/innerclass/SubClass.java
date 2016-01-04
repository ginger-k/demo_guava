package com.demo.innerclass;


/*
 * 成员内部类可以无条件地访问外部类的成员，
 * 在外部类中如果要访问成员内部类的成员，必须先创建一个成员内部类的对象，再通过指向这个对象的引用来访问
 */
public class SubClass {

	private class Sub1 extends SuperClass1 {
		
	}
	
	private class Sub2 extends SuperClass2 {
		
	}
	
	public void method1() {
		Sub1 sub1 = new Sub1();
		sub1.method();
	}
	
	public void method2() {
		Sub2 sub2 = new Sub2();
		sub2.method();
	}
	
}
