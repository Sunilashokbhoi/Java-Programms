package com.Overriding.Seald_Class;
class A2{
	protected int a =10;
	protected int b = 20;
	//public final void calculate() {
	  public void calculate() {		//without final
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
}
class B extends A2{
	public void calculate() {
		int mul = a*b;
		System.out.println("multiplie = "+mul);
	}
}

public class FinalMethos2 {
	public static void main(String[] args) {
		A2 a1 = new B();
		a1.calculate();
	}
}
