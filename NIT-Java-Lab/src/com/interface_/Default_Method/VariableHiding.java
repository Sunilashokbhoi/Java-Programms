package com.interface_.Default_Method;
interface Hello{
	int x = 100;
}
abstract class Test {
	int x = 200;
}
class MyClass extends Test implements Hello{
	int x = 300; 
	public void show() {
		System.out.println(x);
	}
}
public class VariableHiding {
	public static void main(String[] args) {
		new MyClass().show();
	}
}
