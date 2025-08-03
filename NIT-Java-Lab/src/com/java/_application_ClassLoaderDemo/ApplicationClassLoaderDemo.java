package com.java._application_ClassLoaderDemo;

class Test{
	
}
public class ApplicationClassLoaderDemo {
	public static void mai(String[] args) {
	System.out.println("Test.class is loaded by :");
	System.out.println(Test.class.getClassLoader());
	}
}
