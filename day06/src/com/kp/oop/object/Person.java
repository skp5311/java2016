package com.kp.oop.object;

public class Person {
	int age;
	String name;

	public Person(){}
	
	
	public void eat() {
		System.out.println(name + "ÿ�춼��ͬ���ķ�");

	}

	public void sleep() {
		System.out.println(name + "ÿ�춼��˯");
	}

	public String showInfo() {
		return "����" + name + ",������" + age;
		
	}
	
	public void play(Student stu){
		stu.eat();
		System.out.println(stu.name+"ÿ���2Сʱ��Ϸ");
	}
}
