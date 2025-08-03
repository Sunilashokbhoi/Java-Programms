package com.java.constructore_overloading;
class Demo{
	int x;
	{
		x= 100;
		System.out.println("Object creation is in process");
	}
}
public class InstanceBlockDemo2 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1.x);
		
		Demo d2 = new Demo();
		System.out.println(d2.x);
	}
}
