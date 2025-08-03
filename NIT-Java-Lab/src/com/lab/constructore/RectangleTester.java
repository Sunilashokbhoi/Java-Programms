package com.lab.constructore;
class Rectangle{
	private double width = 0;
	private double heigth=0;
	
	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}

	public double getWidth() {
		return width* heigth;
	}

	public double getHeigth() {
		return (2*heigth+width);
	}
}

public class RectangleTester {
	public static  void main(String[] args) {
		Rectangle r = new Rectangle(5,10);
		System.out.println("Area: "+r.getWidth());
		System.out.println("Perimeter: "+r.getHeigth());
		
	}
}
