package com.exception.basic;

public class MultipleCatch1{
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			String str1 = "null";
			System.out.println(str1.toUpperCase());
			String str2 = "Sunil";
			int x = Integer.parseInt(str2);
			System.out.println("Number is :"+x);
		}catch(NumberFormatException | NullPointerException e) {
			if(e instanceof NumberFormatException) {
				System.err.println("Number is not in a proper format");
			}else
				if(e instanceof NullPointerException) {
					System.err.println("ref variable is pointing to null");
				}
		}
		System.out.println("Main Method Ended");
	}
}

