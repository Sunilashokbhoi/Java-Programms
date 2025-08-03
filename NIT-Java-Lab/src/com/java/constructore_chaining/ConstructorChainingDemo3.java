package com.java.constructore_chaining;

class Animal{
	
	protected String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}
} 
class Dog extends Animal{
	
	public Dog(String dogName) {
		super(dogName);
	}
	public String  getDogName() {
		return this.getDogName();
	}
}
class Tiger extends Animal
{
	public Tiger(String tigerName) {
		super(tigerName);
	}
	public String getTugerName() {
		return this.name;
	}
}
public class ConstructorChainingDemo3 {
	public static void main(String[] args) {
		Dog tommy = new Dog("Tommy");
		System.out.println("Dog Name is "+tommy.getDogName());
	}
}
