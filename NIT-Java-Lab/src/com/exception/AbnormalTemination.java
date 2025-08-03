package com.exception;

import java.util.Scanner;

public class AbnormalTemination {
	public static void main(String[] args) {
		System.out.println("Main method Started!!!");
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the value");
		int x= sc.nextInt();
		System.out.println("Enter value of y");
		int y = sc.nextInt();
		int result = x/y;
		System.out.println("Result is:"+result);
		System.out.println("Main method Completed!!!");
		}catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("Continue ");
		sc.close();
	}
}
