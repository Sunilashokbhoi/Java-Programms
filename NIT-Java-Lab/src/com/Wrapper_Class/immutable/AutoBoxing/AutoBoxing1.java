package com.Wrapper_Class.immutable.AutoBoxing;

public class AutoBoxing1 {
	public static void main(String[] args) {
		int a = 12;
		Integer x = Integer.valueOf(a); //Upto 1.4.version
		System.out.println(x);
		
		int y = 15;
		Integer i = y;  // From 1.5 onward 
		System.out.println(i);
	}
}
