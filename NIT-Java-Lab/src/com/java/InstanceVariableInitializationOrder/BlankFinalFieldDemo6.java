package com.java.InstanceVariableInitializationOrder;
class Hello{
	final int x;
	
	public Hello() {
		
		System.out.println("x "+x);
	}
	public Hello(int y) {
		System.out.println("y "+y);
	}
	{
		x = 100;
	}
}
public class BlankFinalFieldDemo6 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello(1);

	}

}
