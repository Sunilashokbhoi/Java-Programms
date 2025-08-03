package com.java.constructore_overloading;

public class PrivateConstructore {
	private PrivateConstructore() {
		System.out.println("Private Constuctore");
	}
	
	public static void main(String[] args) {
		new PrivateConstructore();
	}
}
