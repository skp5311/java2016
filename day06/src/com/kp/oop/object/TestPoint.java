package com.kp.oop.object;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 5;
		String s = p1.showInfo();
		System.out.println(s);

		Point p2 = new Point();
		p2.x = 6;
		p2.y = 2;
		String s1 = p2.showInfo();
		System.out.println(s1);

		Point p3 = new Point();
		String s3 = p3.showInfo();
		System.out.println(s3);

		Point p = new Point(8, 9);
		String s4 = p.showInfo();
		System.out.println(s4);
	}
}
