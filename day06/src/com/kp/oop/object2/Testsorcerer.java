package com.kp.oop.object2;

public class Testsorcerer {

	public static void main(String[] args) {
		Sorcerer s1 = new Sorcerer();
		s1.life = 10000;

		System.out.println(s1.showInfo());

		Sorcerer s2 = new Sorcerer(2, 2, 5000);
		System.out.println(s2.showInfo());
	}
}
