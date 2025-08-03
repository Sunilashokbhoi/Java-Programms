package com.java.staticBlockDemo;
class Foo{
	Foo(){
		System.out.println("No Argument Constructore..");
	}
	{
		System.out.println("Instance BLock");
	}
	static {
		System.out.println("Static block ...");
	}
}
public class StaticBlockDemo {
	public static void main(String[] args) {
		System.out.println("Main Method Execution..");
	}
}
