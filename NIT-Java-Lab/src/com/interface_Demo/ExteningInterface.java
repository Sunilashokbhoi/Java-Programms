package com.interface_Demo;
abstract interface Alpha{
	void m1();
}
abstract interface Beta extends Alpha{
	void m2();
}
class Sub implements Beta
{
	public void m1() {
		System.out.println("M1 method implemented");
	}
	public void m2() {
		System.out.println("m2 method implemented");
	}
}
public class ExteningInterface {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.m1();
		s1.m2();
	}
}
