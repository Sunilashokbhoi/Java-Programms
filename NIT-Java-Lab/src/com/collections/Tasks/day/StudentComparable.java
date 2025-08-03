package com.collections.Tasks.day;

import java.util.Arrays;
import java.util.Scanner;

record Student(int id,String name,int fees){
	
}
public class StudentComparable {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of arrays : ");
		int size = sc.nextInt();
		Student[] student = new Student[size];
	
		for(int i = 0;i<size;i++) {
			System.out.println("Enter student "+(i+1)+"student data");
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter Name ");
			String name = sc.next();
			System.out.println("Enter Fees " );
			int fees = sc.nextInt();
			
			student[i] = new Student(id, name, fees);
			
		}
		Arrays.sort(student, (s1,s2)-> Integer.compare(s1.id(),s2.id()));
		System.out.println("Sorted Student list based on ID: ");
		for(Student students : student) {
			System.out.println(students);
		}
	}
}
