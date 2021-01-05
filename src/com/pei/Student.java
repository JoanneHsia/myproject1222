package com.pei;

public class Student {
	String name;
	int english;
	int math;
	
	public String toString() {
    	int avg = average();
    	String grading = "F";
    	switch(avg/10) {
    	case 10:
    		grading = "A";
    		break;
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
    	return grading;
	}
	
	
	public Student(String n, int english, int math) {
		this.name = n;
		this.english = english;
		this.math = math;		
	}
	public int average() {
		return (english+math)/2;
	}
	


	
	public void printscore() {
		System.out.println(name + "\t" + english + "\t" + math + "\t" + average()+"\t"+ toString());
	}
	


}
