package com.Overriding.method_hiding;
class Super1{
	public static void m1() {
		System.out.println("m1 static method of super class");
	}
}
class Sub1 extends Super1{
	public  void m1() {   //error because it is not static method
		System.out.println("m1 non static method of sub class");
	}
}
public class Method_Hiding1 {
	public static void main(String[] args) {
		//Sub1.m1();
	}
}
