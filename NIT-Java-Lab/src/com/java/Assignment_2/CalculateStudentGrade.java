package com.java.Assignment_2;

public class CalculateStudentGrade {

	
	public static StudentGrade calculateGrade(Student std){
		int marks=std.getMarks();
		char studentGrade=' ';
		if(marks>90) {
			studentGrade='A';
		}
		else if(marks>=75) {
			studentGrade='B';
		}
		else if(marks>=60) {
			studentGrade='C';
		}
		
		else if(marks<60) {
			studentGrade='D';
		}
		return new StudentGrade(std,studentGrade);
		
		
	}
	
	}
		
