package com.compile_Time_Constant;
class Foo{
	public static final int A = 100;
	static {
		System.out.println("Static Block");
	}
}
public class CompileTimeConstant {
	  public static void main(String[] args) {
		System.out.println(Foo.A);
	}
}
