package com.static_factory;
import java.util.Scanner;
public class Student {
	private String name;
	private int age;
	private String grade;
	
	
	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	public static Student createStudent(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Age");
		int a = sc.nextInt();
		System.out.println("Enter Grade");
		String s = sc.next();
		
		sc.close();
		return new  Student(name,a,s);
		
	}
}
