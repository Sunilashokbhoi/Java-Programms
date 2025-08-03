package com.java._Plateform_ClassLoader;

class Demo{
	
}
public class PlatformClassLoader {
	public static void main(String [] args) {
		System.out.println("Super class of Application class Loader");
		System.out.println(Demo.class.getClassLoader().getParent());
	}
}
