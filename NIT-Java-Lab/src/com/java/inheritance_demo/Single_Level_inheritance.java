package com.java.inheritance_demo;

class Super {
	private int x =4;
	private int y=5;
	public void setData(int x, int y) {
		this.x = x ;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
class Sub extends Super {
	public void getData() {
	System.out.println("X value is :"+getX());
	System.out.println("Y value is :"+getY());
	}
}

public class Single_Level_inheritance {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.getData();
		
	}
}
// NOTE : Here with help of Encapsulation we can access private
//        data of super class in sub class using getter setter M. 
