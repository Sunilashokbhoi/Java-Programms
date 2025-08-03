package com.inheritance_programs;

public class Circle extends Shape {
	protected final double PI = 3.14;
	public Circle(int radius) {
		super(radius);
	}
	@Override
	public String toString() {
		double area = PI * val * val;
		return ""+area;
	}
}
