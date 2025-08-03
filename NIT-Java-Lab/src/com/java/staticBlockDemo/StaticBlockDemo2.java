package com.java.staticBlockDemo;
class Demo2{
	static int x ;
	
	static {
		System.out.println("X value is :"+x);
	}
	
	
}
public class StaticBlockDemo2 {
	public static void main(String[] args) {
		new Demo2();
	}
}
