package com.java.constructore_chaining;
class Super{
	public Super()
	{
		super();
		System.out.println("No Argument Constructor of super class");
	}
	public Super(int x) {
		this();
		System.out.println("Parameterized Constructor of super class : "+x);
	}
}
class sub extends Super{
	public sub(int val) {
		super(val);
		System.out.println("Parameterized Constructore of Sub class ");
	}
}

public class ConstructorChainingDemo31 {
	public static void main(String[] args) {
		new sub(12);
	}
}
