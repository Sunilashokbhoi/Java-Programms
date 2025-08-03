package com.exception.basic;

import java.util.Scanner;

public class TryDemo {
	public static void main(String[] args) {
		System.out.println("Main method started...");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value of X :");
			int x = sc.nextInt();
			System.out.println("Enter the value of Y");
			int y = sc.nextInt();
			int result = x/y;
			System.out.println("Result is :"+result);
			System.out.println("end of try block");
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch");
			System.out.println(e);
			System.out.println(e.getCause());
		}
		System.out.println("Main method ended . . ");
		sc.close();
	}
}
