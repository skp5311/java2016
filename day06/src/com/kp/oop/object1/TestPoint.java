package com.kp.oop.object1;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 4;
		p1.showInfo();

		Point p2 = new Point(5, 5);
		p2.showInfo();
	}
}
