package com.java.method_Chaining.class_Loading_MethodArea;

import com.java.Assignment_2.Student;
import com.java.Assignment_3.Employee;

public class ClassLoadingInMethodArea {
	public static void main(String[] args) {
		Class cl =  Student.class;
		System.out.println(cl);
		System.out.println(cl.getName());
		Class Emp = Employee.class;
		System.out.println(Emp.getName());
	}
}
