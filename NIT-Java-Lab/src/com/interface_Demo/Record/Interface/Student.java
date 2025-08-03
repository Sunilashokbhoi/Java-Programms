package com.interface_Demo.Record.Interface;

public record Student(int studentId,String studentName) {
	public Student{
		if(studentId<=0) {
			System.err.println("invalid id");
		}
	}
}
