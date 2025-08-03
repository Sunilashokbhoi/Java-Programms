package com.association.aggregation;

public class Student {
	private int studentId;
	private String studentName;
	private int studentMarks;
	private Colllege college;  //HAS-A Relation 
	public Student(int studentId, String studentName, int studentMarks, Colllege college) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", college=" + college + "]";
	}
	
}
