package com.java.inheritance_demo;
class Alpha {
	
	public Alpha() {
		
	}
	public String toString() {
		return "Hyderabad";
	}
}
class Beta extends Alpha{
	public String toString() {
	   
		return "India";
	}
}

public class Method_OverridingDemo1 {
	public static void main(String[] args) {
		Beta b = new Beta();
		System.out.println(b);
		b.toString();
		System.out.println(b);
	}
}
