package com.inheritance_programs.lambda;
@FunctionalInterface
interface Drawable{
	void draw();
}
public class Main {
	public static void main(String[] args) {
		Drawable d1 = ()-> System.out.println("Drawing");
		d1.draw();
	}
}
