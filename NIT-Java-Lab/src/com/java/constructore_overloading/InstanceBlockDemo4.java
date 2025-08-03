package com.java.constructore_overloading;

class Fool{
	int x;
	int y;
	public Fool(int x,int y) {
		//super();
		this(2.4 , 5.7);
		
		System.out.println("Integer Parameter Constructer");
		System.out.println("x  "+x+"y "+y);
	}
	public Fool(double x ,double y) {
		this(2 , 5.5);
		System.out.println("Double parameter constructer");
		System.out.println("x  "+x+"y "+y);
		
	}
	public Fool(int x ,double y) {
		//this(2 , 5);
		System.out.println("Int Double parameter constructer");
		System.out.println("x  "+x+"y "+y);
		
	}
	{
		System.out.println("Non static block");
	}
}
public class InstanceBlockDemo4 {
	public static void main(String[] args) {
		Fool f1 = new Fool(100,200);
	}
}
