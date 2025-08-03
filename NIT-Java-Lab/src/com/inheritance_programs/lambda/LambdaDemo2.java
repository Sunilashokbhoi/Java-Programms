package com.inheritance_programs.lambda;
@FunctionalInterface
interface Calculate{
	void doSum(int x,int y);

}

public class LambdaDemo2 {
	public static void main(String[] args) {
		Calculate c1 = (c, d)-> System.out.println("Sum is :"+(c+d));
		c1.doSum(12,12);
		Calculate c2 = (a, b) ->System.out.println("Sub is :"+(a-b));
		c2.doSum(10,5);
		
	}

}
