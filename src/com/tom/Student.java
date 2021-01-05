package com.tom;

public class Student {
	String name;
	int english;
	int math;

	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}
  
	public int average() {
		return (english + math) / 2;
	}
	public void print() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + average());
	}
	@Override
	public String toString() {
		int avg = average();
		String grades = "AABCDFFFFF";
		char grading = grades.charAt(10 - avg/10);
		/*
		String grading = "F";
		switch(avg/10) {
		case 10:
		case 9:
			grading = "A";
			break;
		case 8:
			grading = "B";
			break;
		case 7:
			grading = "C";
			break;
		case 6:
			grading = "D";
			break;
		default:
			grading = "F";
			break;
		}
		*/
		/*
		if (avg >= 90 && 100 >= avg) {
			grading = "A";
		} else if (avg >= 80 && 89 >= avg) {
			grading = "B";
		} else if (avg >= 70 && 79 >= avg) {
			grading = "C";
		} else if (avg >= 60 && 69 >= avg) {
			grading = "D";
		}
		*/
		return name + "\t" + english + "\t" + math + "\t" + average() + "\t" + grading;
	}
 }