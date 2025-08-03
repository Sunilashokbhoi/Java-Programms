package com.exception.basic;

public class PrintStackTrace {
	public static void main(String[] args) {
		System.out.println("Main ,method started");
		try {
			String str = null;
			System.out.println(str.toUpperCase());
		}
		catch(Exception e) {
			System.out.println("ref variable is pointing to null");
			System.out.println("Get Massage ..........");
			System.out.println(e.getMessage());
			System.out.println(" ToString ...........");
			System.out.println(e.toString());
			System.out.println("...........");
			System.out.print("Print Stack Strace :- ");
			e.printStackTrace();
	
		}
		System.out.println("Main method ended");
		
	}
	
}
