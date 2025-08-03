package com.Var_Argument;


class Test{
	public void input(int ...x) {
		System.out.println("Var Args executed");
	}
}
public class VarArgumentDemo1 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.input();
		t1.input(10);
		t1.input(10,20);
		t1.input(10,20,30);
		System.out.println(t1);
	}
}
