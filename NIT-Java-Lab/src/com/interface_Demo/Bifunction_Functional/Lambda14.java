package com.interface_Demo.Bifunction_Functional;

public class Lambda14 {
	public static void main(String[] args) {
		BiFunctional<String, String, String> concatinateStrig = (str1 , str2) -> str1 + str2;
		String result = concatinateStrig.apply("Hello","Java");
		System.out.println(result);
		
		BiFunctional<String,String,Integer> concatenateLength = (str1,str2) -> str1.length()+str2.length();
		Integer result1 = concatenateLength.apply("Hello", "Java");
		System.out.println(result1);
	}	
}
