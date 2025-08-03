package com.has_a_relation.copy;

public class Student {
	
	private int studentId;
	private String studentNalme;
	private int studentMarks;
	public Student(int studentId, String studentNalme, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentNalme = studentNalme;
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNalme=" + studentNalme + ", studentMarks=" + studentMarks
				+ "]";
		}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNalme() {
		return studentNalme;
	}
	public void setStudentNalme(String studentNalme) {
		this.studentNalme = studentNalme;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	
}