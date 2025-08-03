package com.Overriding.method_hiding;
class Super2{
	public static void m1() {
		System.out.println("m1 non static method of super class");
	}
}
class Sub2 extends Super{
	public static void m1() {
		System.out.println("m1 static method of sub class");
	}
}
public class MethodHiding2 {
	public static void main(String[] args) {
		Super2 s = new Super2();
		Sub2  s4 = new Sub2();
		s.m1();
		s4.m1();
	}
}
