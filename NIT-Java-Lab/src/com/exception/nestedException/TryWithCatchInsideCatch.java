package com.exception.nestedException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(sc){
			System.out.println("Enter your Roll number :");
			int roll = sc.nextInt();
			System.out.println("Your Roll is :"+roll);
		}
		catch (InputMismatchException e) {
			System.err.println("Provide Valid input !!");
			
			try
			{
				System.out.println(10/0);
			}
			catch (ArithmeticException e1) {
				System.err.println("Divide by zero problem");
			}
		}
		finally {
			System.out.println("Finally block ");
			try {
				Object []obj = new String[3];
				obj[0] = "12";
				obj[1] = "14";
				obj[2] = 90;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid element so can't store in array");
			}
		}
	}
}
