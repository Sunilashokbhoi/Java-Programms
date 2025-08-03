package com.Overriding.Abstract_Class;
abstract class Alpha{
	public abstract void show();
	public abstract void demo();
}
abstract class Beta extends Alpha{
	@Override
	public void show() {
		System.out.println("Show Method Overridden in Beta class");
		
	}
}
class Gamma extends Beta{
	@Override
	public void demo() {
		System.out.println("Demo class Overridden in Gamma class..");
	}
}
public class AbstractDemo3 {
	public static void main(String[] args) {
		Gamma g = new Gamma();
		g.show();
		g.demo();
	}
}
