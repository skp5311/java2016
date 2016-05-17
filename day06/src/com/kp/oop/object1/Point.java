package com.kp.oop.object1;

public class Point {
	int x;
	int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showInfo() {
		System.out.println("(" + x + "," + y + ")");
	}
}
