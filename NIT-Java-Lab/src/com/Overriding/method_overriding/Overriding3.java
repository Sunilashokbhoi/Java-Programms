package com.Overriding.method_overriding;
class Bird {
	public void fly() {
		System.out.println("Generic Bird is Flying..");
	}
}
class Parrot extends Bird{
	public void fly() {
		System.out.println("Parrot Bird is flying");
	}
}
class Peacock extends Bird{
	public void fly() {
		System.out.println("Peacock is flying");
	}
}
public class Overriding3 {
	public static void main(String[] args) {
		Bird b = null;
		b = new Parrot(); //Dynamic Method Dispatch
		b.fly();
		b = new Peacock();
		b.fly();
	}
}
