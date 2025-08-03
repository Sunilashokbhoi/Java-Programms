package com.Overriding.Abstract_Class;
abstract class Animal{
	protected String name;
	public Animal (String name) {
		super();
		this.name = name;
	}
	public abstract void checkup();
}
class Lion extends Animal{
	
	public Lion(String name) {
		super(name);
	}
	public void checkup() {
		System.out.println(name+" is going for checkup");
	}
}
class Elephant extends Animal{
	public Elephant(String name) {
		super(name);
	}
	public void checkup() {
		System.out.println(name+ "is going for checkup");
	}
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	public void checkup() {
		System.out.println(name+" is going for checkup");
	}
}
public class AbstractDemo4 {
	public static void main(String[] args) {
		Lion lions[] = {new Lion("simba"), new Lion("Scar"),new Lion("Alex")};
		Elephant[] elephant = {new Elephant("Airavata"), new Elephant("My ele")};
		Dog [] dog = {new Dog("Tommy"),new Dog("Tiger"),new Dog("My Dog")};
		
		checkAnimal(lions);
		System.out.println("..........");
		checkAnimal(elephant);
		System.out.println("..........");
		checkAnimal(dog);
		
	}
	public static void checkAnimal(Animal ...animals) {
		for(Animal animal : animals) {
			animal.checkup();
		}
	}
}
