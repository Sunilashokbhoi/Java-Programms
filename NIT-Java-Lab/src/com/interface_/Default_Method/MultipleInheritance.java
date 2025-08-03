package com.interface_.Default_Method;

interface Alpha {
	default void m1() {
		System.out.println("m1 method of Alpha inheritance ");
	}
}

interface Beta {
	default void m1() {
		System.out.println("m1 method of Beta interface ");
	}
}
class Foo implements Alpha, Beta {
	public void m1() {
		Alpha.super.m1();
		Beta.super.m1();
		System.out.println("M1 is possible using default method");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		new Foo().m1();
	}
}
