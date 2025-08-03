package com.java.inheritance_demo;
class Father{
	public void house() {
		System.out.println("3 BHK House");
	}
}
class Son extends Father{
	public void car() {
		System.out.println("Audi car");
	}
}

public class Inheritance_Demo1 {
	public static void main(String[] args) {
	//Father f = new Father();
	Son s = new Son();
	s.car();   //son access own properties and
	s.house(); //access also father properties using extend keyword 
				//is called inheritance 
	}
}
//Note : In inheritance we should always create the object for more specialized sub class.
