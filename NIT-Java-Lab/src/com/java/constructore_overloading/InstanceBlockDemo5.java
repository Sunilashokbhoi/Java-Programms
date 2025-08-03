package com.java.constructore_overloading;
class sample5{
	int x;
	public sample5() {
		
		x=400;
		System.out.println(x);
	}
	{
		x=100;
		System.out.println(x);
	}
	{
		x=200;
		System.out.println(x);
	}
	{
		x=300;
		System.out.println(x);
	}
}
public class InstanceBlockDemo5 {
	public static void main(String[] args) {
		new sample5();
	}
}
