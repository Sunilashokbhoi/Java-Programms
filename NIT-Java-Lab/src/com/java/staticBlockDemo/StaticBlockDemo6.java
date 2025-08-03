package com.java.staticBlockDemo;
class Demo6{
	static {
		i = 100;
		//System.out.println(i);  //illegal forward reference
		System.out.println(Demo6.i);
	}
	 static int i ;
}
public class StaticBlockDemo6 {
	public static void main(String[] args) {
		System.out.println(Demo6.i);
	}
}
