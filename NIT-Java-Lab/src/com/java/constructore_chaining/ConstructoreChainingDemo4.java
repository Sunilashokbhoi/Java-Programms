package com.java.constructore_chaining;
class Base{
	public Base(){
		this(15);
		System.out.println("No Argument Constructor of Base class");
	}
	public Base(int x) {
		System.out.println("Parameterized Constructor of Base class :"+x);
	}
}
class Derived extends Base{
	public Derived() {
		System.out.println("No Argument Constructor of Derived class");
	}
}

public class ConstructoreChainingDemo4 {
	public static void main(String[] args) {
		new Derived();
	}
}
