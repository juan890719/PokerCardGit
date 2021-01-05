package com.tom;

public class Scoring {

	public static void main(String[] args) {
//		int stu1English = 65;
//		int stu1Math = 70;
		Student stu1 = new Student("Jack", 33, 86);
		int avg = stu1.average();
		if (avg < 60) {
			System.out.println("I am sorry.");
		} else {
			System.out.println("Congradulation");
		}
//		System.out.println(stu1.name + "\t" + stu1.english + "\t" + stu1.math);
		System.out.println(stu1);
	}
}