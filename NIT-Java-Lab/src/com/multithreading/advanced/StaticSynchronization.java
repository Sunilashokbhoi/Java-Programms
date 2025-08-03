package com.multithreading.advanced;
class PrintTable{
	public static synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" x "+" = "+(n*i));
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
		System.out.println("..................");
	}
}
public class StaticSynchronization {
	public static void main(String[] args) {
		Thread t1 = new Thread()
		{
			public void run() {
				PrintTable.printTable(5);;
			}
		};
		Thread t2= new Thread() {
			public void run() {
				PrintTable.printTable(10);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				PrintTable.printTable(15);
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				PrintTable.printTable(20);;
		
			}
		};
		t1.start();t2.start();
		t3.start();t4.start();
	}
}
