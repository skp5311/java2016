package com.kp.oop.object2;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "ÀîËÄ";
		p1.weight = "55kg";
		p1.hight = "175cm";
		p1.sex='ÄĞ';

		System.out.println(p1.showInfo());

		p1.eat();
		p1.run();
		p1.play();

	}

}
