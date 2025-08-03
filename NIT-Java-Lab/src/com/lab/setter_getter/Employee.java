package com.lab.setter_getter;

public class Employee {
	private String employeeName;
	private double basicSalary;
	private int performanceRating;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	
	public void display() {
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Salary :"+basicSalary);
		System.out.println("Employee Name :"+performanceRating);
	}
	
}
