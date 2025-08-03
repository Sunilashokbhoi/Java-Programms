package com.has_a_relation.copy;

import java.util.Scanner;

public class Trainer {
	public static void  viewStudentProfile(Student obj) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		if(id == obj.getStudentId()) {
			System.out.println(obj);
		}else {
			System.err.println("Id is invalid ");
		}
	}
}
