package com.kp.oop.object2;

public class Person {
	int age;
	String name;
	String hight;
	String weight;
	char sex;

	public String showInfo() {
		return "�ҵ�������" + name +"���Ա���" +sex+"��������" + age + "��������" + weight + ",�����" + hight;
	}

	public void eat() {
		System.out.println("ÿ��8�����ҳԷ�");
	}

	public void run() {
		System.out.println("ÿ�����1Сʱ���ܲ��˶�");

	}

	public void play() {
		System.out.println("ÿ������Ϸ");
	}
}
