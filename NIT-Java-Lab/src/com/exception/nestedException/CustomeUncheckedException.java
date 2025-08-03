package com.exception.nestedException;

import java.util.Scanner;

class GreaterMarksException extends RuntimeException{
	public GreaterMarksException() {
		
	}
	public GreaterMarksException(String errorMessage) {
		super(errorMessage);
	}
}

public class CustomeUncheckedException { 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(sc){
			System.out.println("Enter your marks");
			int marks = sc.nextInt();
			validateMarks(marks);
		}
		catch(GreaterMarksException e) {
			e.printStackTrace();
		}
	}
	 public static void validateMarks(int marks) {
		 if(marks > 100) {
			 throw new GreaterMarksException("Invalid Marks");
		 }
		 else {
			 System.out.println("your marks is :"+marks);
		 }
	 }
}
