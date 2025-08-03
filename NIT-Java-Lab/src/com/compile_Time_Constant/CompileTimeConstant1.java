package com.compile_Time_Constant;
class Foo1{
	public static final int A = returnValue();
	static {
		System.out.println("static block");
	}
	public static int returnValue() {
		return 500;
	}
}
public class CompileTimeConstant1 {
	public static void main(String[] args) {
		System.out.println(Foo1.A);
	}
}
