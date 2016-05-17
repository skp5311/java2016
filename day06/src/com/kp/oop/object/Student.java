package com.kp.oop.object;

public class Student {
	int age;
	String name;
	Double score;

	public void eat() {
		System.out.println(name + "每天都吃饭");
	}

	public void run() {
		System.out.println(name + "每天都跑1000米");
	}

	public String showInfo() {
		return "我是" + name + ",年龄是" + age;
	}
}
