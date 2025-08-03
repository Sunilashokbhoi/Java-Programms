package com.inheritance_programs;

public class Rectangle extends Shape{
	protected Rectangle (int length , int breath) {
		super(length);
		this.breath = breath;
	}
	public String toString() {
		double area = val * breath;
		return ""+area;
	}
}
