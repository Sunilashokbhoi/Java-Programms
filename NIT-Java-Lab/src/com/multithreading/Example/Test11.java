package com.multithreading.Example;

public class Test11 {
	static String sName = "good";
	public static void main(String[] args) {
		Test11 t = new Test11();
		System.out.println(sName);
		Thread t1 = new Thread();
		t1.start();
		t.nameTest("sunil");
		
	}
	public void nameTest(String sName) {
		sName = sName + " idea";
	System.out.println(sName);
	}
	public void run() {
		for(int i=1;i<4;i++) {
			sName = sName +""+i;
			System.out.println(sName);
		}
	}
}
