package com.pei;

public class Scoring {

	public static void main(String[] args) {
		Student stu1 = new Student("Jack", 60, 80);
		int average = stu1.average();
		if (average<=60) {
			System.out.println("I am sorry");			
		}
		else {
			System.out.println("Congratulation");
		}
		//System.out.println(stu1);
		stu1.printscore();

	}

}
