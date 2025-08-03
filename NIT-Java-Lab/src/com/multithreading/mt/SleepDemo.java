package com.multithreading.mt;
class Sleep extends Thread{
	@Override
	public void run(){
		for(int i=1; i<=10 ;i++) {
			System.out.println("I value is "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.err.println(e);
			}
		}
	}
}
public class SleepDemo {
	public static void main(String[] args) {
		Sleep s1 =  new Sleep();
		s1.start();
	}
}
