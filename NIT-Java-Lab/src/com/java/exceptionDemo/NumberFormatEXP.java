package com.java.exceptionDemo;

public class NumberFormatEXP {
	public static void main(String[] args) {
		String str = "123";
		int x = Integer.parseInt(str);
		System.out.println(x);
		
		String s1 = "HTML";
		Integer  y = Integer.valueOf(s1);
		System.out.println(y);
	}
}
