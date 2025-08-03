package com.Var_Argument;
class Sample{
	public void accept(int x,int... y) {
		System.out.println("X Value is :" + x);
		for(int z : y) {
			System.out.println("X value is :"+z);
		}
	}
}
public class VarArgDemo3_Invalid {
	
	public static void main(String[] args) {
		Sample s1= new Sample();
		s1.accept(12,10,20,30,40);
	}
}
