package com.kp.oop.object;

public class Person {
	int age;
	String name;

	public Person(){}
	
	
	public void eat() {
		System.out.println(name + "每天都吃同样的饭");

	}

	public void sleep() {
		System.out.println(name + "每天都晚睡");
	}

	public String showInfo() {
		return "我是" + name + ",年龄是" + age;
		
	}
	
	public void play(Student stu){
		stu.eat();
		System.out.println(stu.name+"每天打2小时游戏");
	}
}
