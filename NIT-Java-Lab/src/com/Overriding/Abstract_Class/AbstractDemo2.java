package com.Overriding.Abstract_Class;

abstract class Shape2 {
	protected  String shapeType;

	public Shape2(String shapType) {
		super();
		this.shapeType = shapType;
	}

	public abstract void draw();
}

class Square2 extends Shape2 {
	public Square2(String shape) {
		super(shape);
	}

	public void draw() {
		System.out.println("Drawing :" + shapeType);
	}
}

class Rectangle2 extends Shape2 {
	public Rectangle2(String shape) {
		super(shape);
	}

	public void draw() {
		System.out.println("Drawing :" + shapeType);
	}
}

public class AbstractDemo2 {
	public static void main(String[] args) {
		Square2 ss = new Square2("Square");
		ss.draw();
		Rectangle2 rr = new Rectangle2("Rectangle");
		rr.draw();
	}
}
