package com.multithreading.synchronization;
class Table {
	public synchronized void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
			try{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(".........................");
	}
}
public class MethodSynchronizarion {
	public static void main(String[] args) {
		Table obj = new Table();
		Thread t1 = new Thread()
				{
				public void run() {
					obj.printTable(5);
				}
				};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(10);
			}
		};
		t1.start();
		t2.start();
				
	}
}
