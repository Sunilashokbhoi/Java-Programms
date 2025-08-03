package com.java.InstanceVariableInitializationOrder;
class sample{
	private int x = 100;
	{
		x = 200;
		System.out.println(x);
	}
	public sample() {
		x = 300;
	}
	public int getX() {
		return this.x;
	}

}
public class InstanceVariableInitializationOrder {
	public static void main(String[] args) {
		sample s = new sample();
		System.out.println(s.getX());
	}
}
