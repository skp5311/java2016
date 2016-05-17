package com.kp.oop.object2;

public class Person {
	int age;
	String name;
	String hight;
	String weight;
	char sex;

	public String showInfo() {
		return "我的名字是" + name +"，性别是" +sex+"，年龄是" + age + "，体重是" + weight + ",身高是" + hight;
	}

	public void eat() {
		System.out.println("每天8点左右吃饭");
	}

	public void run() {
		System.out.println("每天进行1小时的跑步运动");

	}

	public void play() {
		System.out.println("每天玩游戏");
	}
}
