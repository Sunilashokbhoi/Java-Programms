package com.final_class;
final class Test{
	private int data = 100;
	public Test(int data) {
		this.data = data;
		System.out.println("Data value is :"+data);
	}
}

public class FinalClassEx1 {
	public static void main(String[] args) {
		Test t1 = new Test(200);
	}
}
