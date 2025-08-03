package com.exception.try_with_Resourses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourseDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc){
			System.out.println("Enter Your Roll Number  ");
			int rn = sc.nextInt();
			System.out.println("Roll Number is "+rn);
		}
		catch (InputMismatchException e) {
			System.err.println("Input miss Match Exception");
		}
	}
}
