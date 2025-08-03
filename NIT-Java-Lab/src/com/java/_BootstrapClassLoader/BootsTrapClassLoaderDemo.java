package com.java._BootstrapClassLoader;
class Foo{
	
}
public class BootsTrapClassLoaderDemo {
	public static void main(String[] args) {
		System.out.println("Bootrap class");
		System.out.println(Foo.class.getClassLoader().getParent().getParent());
	}
}
