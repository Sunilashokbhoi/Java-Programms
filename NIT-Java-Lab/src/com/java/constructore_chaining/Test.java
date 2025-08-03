package com.java.constructore_chaining;
class A{
	public A() {
		System.out.println("A");
	}
}
class B extends A{
	
}
class C extends B{
	public C(String as) {
		
		System.out.println("C");
	}
}
public class Test {
	public static void main(String[] args) {
		new C("Nit");
	}
}
