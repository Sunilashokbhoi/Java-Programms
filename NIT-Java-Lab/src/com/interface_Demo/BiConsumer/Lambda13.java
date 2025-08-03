package com.interface_Demo.BiConsumer;

public class Lambda13 {
	public static void main(String[] args) {
		BiConsumer<Integer,String> updateVariable = (num , str) ->{
			num = num*2;
			str = str.toUpperCase();
			System.out.println("Update values: " + num+", "+str);
		};
		int number = 15;
		String text = "nit";
		updateVariable.accept(number, text);
		System.out.println("Original values : "+number +","+text);
	}
}
