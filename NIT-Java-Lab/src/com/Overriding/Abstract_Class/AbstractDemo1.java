package com.Overriding.Abstract_Class;

abstract class Shape {
	public abstract void draw();
}

class Square extends Shape {
	public void draw() {
		System.out.println("Drawing square");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class AbstractDemo1 {
	public static void main(String[] args) {
		Shape s = new Square();
		s.draw();
		Shape s1 = new Rectangle();
		s1.draw();
	}
}
