package com.kp.oop.object;

public class TestPersom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.age = 12;
		p1.name = "����";
		p1.eat();
		p1.sleep();
		String s = p1.showInfo();
		System.out.println(s);

		Student stu = new Student();
		stu.name = "����";
		p1.play(stu);

	}

}
