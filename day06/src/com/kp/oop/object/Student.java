package com.kp.oop.object;

public class Student {
	int age;
	String name;
	Double score;

	public void eat() {
		System.out.println(name + "ÿ�춼�Է�");
	}

	public void run() {
		System.out.println(name + "ÿ�춼��1000��");
	}

	public String showInfo() {
		return "����" + name + ",������" + age;
	}
}
