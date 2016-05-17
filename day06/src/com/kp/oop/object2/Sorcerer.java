package com.kp.oop.object2;

public class Sorcerer {
	int rank;
	int life;
	int sword;

	public Sorcerer() {
	}

	public Sorcerer(int x, int y, int z) {
		rank = x;
		sword = y;
		life = z;
	}

	public String showInfo() {
		return "巫师的级别：" + rank + "，战斗力是:" + sword + ",生命值是:" + life;
	}

}
