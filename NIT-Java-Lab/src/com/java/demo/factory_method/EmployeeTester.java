package com.java.demo.factory_method;
import java.util.Scanner;
public class EmployeeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many object you want ?");
		int noOfObject = sc.nextInt();
		
		for(int i = 1;i <= noOfObject;i++) {
			Employee object = Employee.getEmployeeObject();
			System.out.println(object);
			}
		sc.close();	
}
}
