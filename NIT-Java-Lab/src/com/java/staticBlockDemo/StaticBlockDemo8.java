package com.java.staticBlockDemo;

public class StaticBlockDemo8 {
	final static int x;
	static {
		m1();
			x=15;
		}
		public static void m1() {
			System.out.println("Default value X is "+x);
		}
		public static void main(String[] args) {
			System.out.println("After Initialization : "+StaticBlockDemo8.x);
		}
	}
