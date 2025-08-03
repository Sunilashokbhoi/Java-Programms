package com.java.staticBlockDemo;

public class StaticBlockDemo7 {
	static {
		System.out.println("Static Block..");
		//return;   //ERROR 
	}
	public static void main(String[] args) {
		System.out.println("Main Method...");
	}
}
