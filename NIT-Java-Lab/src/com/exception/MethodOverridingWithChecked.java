package com.exception;

class Super{
	public void show() {
		System.out.println("Super class method not throwing checked exception  ");
	}
}

class Sub extends Super{
	public void show() {
		System.out.println("Sub class method should not throw checked exception ");
	}
}

public class MethodOverridingWithChecked {
	public static void main(String[] args) {
		
	}
}
