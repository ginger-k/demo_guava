package com.demo.innerclass;

public class People {
	private String sex;

	public People() {
	}
	
	private People(String sex) {
		this.sex = sex;
	}
	
	//局部内部类不能访问外部类的成员变量
	public People getMan() {
		class Man extends People {
			Man() {
				super("男");
			}
		}
		return new Man();
	}
	
	public People getWoman() {
		class Woman extends People {
			Woman() {
				super("女");
			}
		}
		return new Woman();
	}
	
	public String getSex() {
		return this.sex;
	}
	
	
}


