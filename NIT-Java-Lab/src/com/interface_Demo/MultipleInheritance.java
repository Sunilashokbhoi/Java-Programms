package com.interface_Demo;
interface A
{
	void m1();
}
interface B {
	void m1();
}
class Implementer implements A,B{
	public void m1() {
		System.out.println("Multiple Inheritance is Possible.");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		new Implementer().m1();
	}
}
