package com.interface_Demo;

import java.util.Objects;

class Student {
	/**
	 * @param studentId
	 * @param studentName
	 */
	protected Student(Integer studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	private Integer studentId;
	private String studentName;
	protected Integer getStudentId() {
		return studentId;
	}
	protected void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	protected String getStudentName() {
		return studentName;
	}
	protected void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentId, other.studentId) && Objects.equals(studentName, other.studentName);
	}
	
	
}
public class EqualsObjectComparison {
	public static void main(String[] args) {
		Student s1 = new Student(111,"Raj");
		Student s2 = new Student(111,"Raj");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//true (Overridden Method)
	}
}
