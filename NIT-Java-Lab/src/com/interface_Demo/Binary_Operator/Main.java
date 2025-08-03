package com.interface_Demo.Binary_Operator;
interface Drawable {
	void draw();
}
public class Main {
	public static void main(String[] args) {
		String shapeType = "Rectangle"; //local var
		Drawable d1 = ()-> {System.out.println("Drawing : "+shapeType);
		};
		d1.draw();
	}
}
