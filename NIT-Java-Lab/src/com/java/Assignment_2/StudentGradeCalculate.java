package com.java.Assignment_2;

public class StudentGradeCalculate {
	//main class
	public static void main(String[] args) {
	
		Student std=new Student("Sunil",91);
		StudentGrade cal=CalculateStudentGrade.calculateGrade(std);
		System.out.println(cal);
		char c = '\u0016';
		System.out.println("c"+c+"c");
		
	}
}
