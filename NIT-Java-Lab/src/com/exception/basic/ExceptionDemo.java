package com.exception.basic;
class Foo{
	
}
public class ExceptionDemo {
	public static void main(String[] args) {
		try{
			//throw new Foo(); //error
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
