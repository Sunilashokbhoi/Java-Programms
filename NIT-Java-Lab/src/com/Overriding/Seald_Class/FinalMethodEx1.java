package com.Overriding.Seald_Class;
class Alpha{
	protected int a =100;
	private final  void accept() {
		int b = a;
		System.out.println("Alpha class accept method"+b);
	}
}
class Beta extends Alpha{
	public void accept() {
		System.out.println("Beta class accept method");
	}
}
public class FinalMethodEx1 {
	public static void main(String[] args) {
		//Alpha a = new Alpha();
		//a.accept();
		new Beta().accept();
	}
}
