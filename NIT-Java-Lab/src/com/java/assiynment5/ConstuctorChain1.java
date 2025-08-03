package com.java.assiynment5;

public class ConstuctorChain1 {
	public static void main(String[] args) {
		new Alpha();
		new Beta();
	}
}
class Alpha extends Beta{
	Alpha(){
		System.out.println("Alpha");
	}
}
class Beta{
	Beta(){
		System.out.println("Beta");
	}
}
