package com.java.exceptionDemo;

public class NullPointerEXP {
	public static void main(String[] args) {
		//Case 1 : error
		String str = null;
		System.out.println(str.length());
		//Case 2 :
		String str1 = "null";
		System.out.println(str1.length()+","+str1.toUpperCase());
	
	  //Case 3 :
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = sc.nextLine(); //"Null"
		System.out.println(name.length()+","+name.toUpperCase());
	}
}
