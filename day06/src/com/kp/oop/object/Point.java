package com.kp.oop.object;

public class Point {
	int x;
	int y;

	Point() {
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}

	public String showInfo() {
		return "(" + x + "," + y + ")";
	}
}
