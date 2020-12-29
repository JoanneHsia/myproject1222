package com.pei;

public class Student {
	String name;
	int english;
	int math;
	
	public Student(String n, int english, int math) {
		this.name = n;
		this.english = english;
		this.math = math;		
	}
	public int average() {
		return (english+math)/2;
	}
	public void printscore() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + average());
	}

}
