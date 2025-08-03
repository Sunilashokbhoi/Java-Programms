package com.Overriding.method_hiding;
class Super3{
	public static void m1() {
		System.out.println("m1 static method of super class");
	}
}
class Sub3 extends Super3{
	public static int m1() {
		System.out.println("m1 static method of Sub class");
		return 0;
	}
}
public class MethodHiding3 {
	public static void main(String[] args) {
		Sub3.m1();
	}
}
