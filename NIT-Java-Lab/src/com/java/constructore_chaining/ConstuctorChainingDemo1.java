package com.java.constructore_chaining;

class Alpha{
	public Alpha() {
		super();
		System.out.println("No argument Constructor of Alpha class");
		}
}
class Beta extends Alpha {
	public Beta() {
		super();
		System.out.println("No Argument Constructor of Beta Class");
	}
}
public class ConstuctorChainingDemo1 {
	public static void main(String[] args) {
		 new Beta();
	}
}
