package com.Overriding.method_hiding;
class Super{
	public static void m1() {
		System.out.println("M1 static method of super class");
	}
}
class Sub extends Super{
	
}
public class Method_Hiding {
	public static void main(String[] args) {
		
	Super.m1();
	Sub.m1();
	Sub s1 = new Sub();
	s1.m1();
	}
}
