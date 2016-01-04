package com.demo.innerclass;

public class Client {
	
	
	public static void main(String[] args) {
		//局部内部类测试
		People man = new People().getMan();
		System.out.println(man.getSex());
		
		//成员内部类测试
		SubClass subClass = new SubClass();
		subClass.method1();
		subClass.method2();
		
		for(int i = 0; i < 3; i++) {
			final String s = i + "";
			//匿名内部类
			new Thread(){
				@Override
				public void run() {
					System.out.println("thread线程 " + s);
				}
			}.start();
			
			new Thread(new Runnable(){
				//匿名内部类
				@Override
				public void run() {
					System.out.println("runnable线程 " + s);
				}
			}).start();
		}
		
		System.out.println("总线程结束");
	}

}
