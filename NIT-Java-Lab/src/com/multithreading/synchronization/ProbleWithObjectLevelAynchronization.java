package com.multithreading.synchronization;

class PrintTable{
	public  synchronized void printTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+"=" +n*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
			}
		}
		System.out.println("..................");
	}
}
public class ProbleWithObjectLevelAynchronization {
	public static void main(String[] args) {
		PrintTable pt1 = new PrintTable();
		PrintTable pt2 = new PrintTable();
		
		Thread t1 = new Thread()
				{
				public void run()
				{
					pt1.printTable(2);
				}
				};
				Thread t2 = new Thread() {
					public void run() {
						pt1.printTable(3);
					}
				};
				Thread t3 = new Thread() {
					public void run() {
						pt2.printTable(8);
					}
				};
				Thread t4 = new Thread() {
					public void run() {
						pt2.printTable(9);
					}
				};
				t1.start(); t2.start();
				t3.start();t4.start();
		
		}
}
