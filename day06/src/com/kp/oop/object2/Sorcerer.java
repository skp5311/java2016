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
		return "��ʦ�ļ���" + rank + "��ս������:" + sword + ",����ֵ��:" + life;
	}

}
