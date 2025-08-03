package com.interface_.Default_Method;
interface A{
	default void m1() {
		System.out.println("Default method of interface A ");
	}
}
class B {
	public void m1() {
		System.out.println("Concrete methos of class B ");
	}
}
class C extends B implements A {
	
}
public class Priority {
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.m1();
	}
}
