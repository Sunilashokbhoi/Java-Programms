package com.java.demo.factory_method;
import java.util.Scanner;
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
public static Employee getEmployeeObject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter Employee Salary ");
		double salary = sc.nextDouble();
		sc.close();
		return new Employee(id,name,salary);
	}

	
}
