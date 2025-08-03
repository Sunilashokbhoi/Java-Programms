package com.java.method_Chaining;

public class Method_Chaining_Demo1 {
	public static void main(String[] args) {
		String str = "india";
		char ch = str.concat("is great").toUpperCase().charAt(0);
		System.out.println(ch);
	}
}
