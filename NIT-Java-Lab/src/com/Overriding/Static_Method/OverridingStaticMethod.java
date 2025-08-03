package com.Overriding.Static_Method;
class Animal{
	public static void checkup() {
		System.out.println("Checking up rule for all athe Animals");
	}
}
class Dog extends Animal{
	public static void checkup() {
		System.out.println("Check Up rule for Dog Animal");
	}
}
class Lion extends Animal{
	public static void checkup() {
		System.out.println("CHeck up rule for Lion Animal");
	}
}

public class OverridingStaticMethod {
	public static void main(String[] args) {
		Animal a = null;
		a = new Dog();
		a.checkup();
		a= new Lion();
		a.checkup();
		Dog d =new Dog();
		d.checkup();
	}
}
