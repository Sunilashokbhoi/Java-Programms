package com.static_factory;
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("No of Student ");
		int obj = sc.nextInt();
		Student[] student = new Student[obj];
		
		for(int i=0;i<=obj;i++) {
			System.out.println("Creating Student : "+(i )+":");
			student[i] = Student.createStudent();
		}
		System.out.println("Student Detail");
		for(Student studen  : student) {
			System.out.println(studen);
		}
		sc.close();
	}
}
