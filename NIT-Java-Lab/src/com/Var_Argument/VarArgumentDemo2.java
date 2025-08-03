package com.Var_Argument;
class SumOfParameter{
	public void acceptParameter(int ...values) {
		int sum =0;
		for(int value : values) {
			sum = sum+value;
		}
		System.out.println("Sum Of Parameter is "+sum);
	}
}
public class VarArgumentDemo2 {
	public static void main(String[] args) {
		SumOfParameter s1 = new SumOfParameter();
		s1.acceptParameter(10,20,30,40);
		s1.acceptParameter(100,200,300,400,500);;
	}
}
