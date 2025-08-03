package com.exception.nestedException;

public class VariableInitialization {
   public static void main(String[] args) {
	int x ;
	try {
		int []arr = new int[-10];
		x = 190;
		System.out.println(x);
	}
	catch (Exception e) {
		x =200;
		System.out.println(x);
	}
}
}
