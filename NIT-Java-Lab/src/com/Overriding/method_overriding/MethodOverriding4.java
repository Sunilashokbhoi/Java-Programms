package com.Overriding.method_overriding;
class Bird1 {
	public void fly() {
		System.out.println("Generic Bird is Flying...");
	}
	public void roam() {
		System.out.println("Generic Bird is Roaming");
	}
}
class Parrot1 extends Bird{
	//Method Overloading
	public int fly(double height) {
		System.out.println("Parrot is flying with : "+height+" height");
		return 0;
	}
	
	public void roam() {
		System.out.println("Parrot Bird is Roaming..");
	}
}
public class MethodOverriding4 {
	public static void main(String[] args) {
		Parrot1 p = new Parrot1();
		p.fly(15.6);
		p.roam();
	}
}
