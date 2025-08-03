package com.Wrapper_Class.immutable.AutoBoxing;
  
public class AutoBoxing3 {
	public static void main(String[] args) {
		Integer a = Integer.valueOf(12);
		
		Integer b = Integer.valueOf("25");
		
		Integer c = Integer.valueOf("111",36); //Here Base we can take upto 36
		
		System.out.println(a);
	    System.out.println(b);
		System.out.println(c);
	}
}
