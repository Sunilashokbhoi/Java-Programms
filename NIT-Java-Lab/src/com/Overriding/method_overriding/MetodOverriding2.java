package com.Overriding.method_overriding;
class Animal {
	public void sleep(){
		System.out.println("Generic Animal is Sleeping here");
	}
}
   
class Dog extends Animal{
	@Override
	public void sleep() {
		System.out.println("Dog Animal sleeping");
	}
}
class Puppy extends Animal{
	public void sleep() {
		System.out.println("Puppy Animal Sleeping..");
	}
}
public class MetodOverriding2 {
	public static void main(String[] args) {
		Animal a = new Puppy();
		a.sleep();
		
	}
}
