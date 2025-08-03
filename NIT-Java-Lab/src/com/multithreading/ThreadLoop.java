package com.multithreading;

class Sample extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i = 1; i<= 10 ; i++) {
			System.out.println(" i t values is :"+i+" by "+name+"thread");
		}
	}
}
public class ThreadLoop {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		s1.start();
		s2.start();
		String name = Thread.currentThread().getName();
		for(int i =1;i<=10 ; i++) {
			System.out.println("i m value is :"+i+" by "+name+" thread");
		}
		int x = 1;
		do
		{
			System.out.println("Batch 40 ");
			x++;
		}
		while(x<=10);
		//s2.start();
		//System.out.println("S2 is "+s2.currentThread().getName());
	}
}
