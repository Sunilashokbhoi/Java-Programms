package com.java.staticBlockDemo;
class Demo3
{
	final static int x;
	
	static {
		x = 100;
		
	}
}
public class StaticBlockDemo3 {
	public static void main(String[] args) {
		System.out.println("a value is "+Demo3.x);
	}
}
