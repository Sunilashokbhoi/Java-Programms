//Illegal Forward Reference

package com.java.staticBlockDemo;
class Demo5{
	static {
		i = 100;
	}
	static int i=100;
}
public class StaticBlockDemo5 {
	public static void main(String[] args) {
		System.out.println(Demo5.i); 
	}
}
