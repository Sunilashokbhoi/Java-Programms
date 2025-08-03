package com.multithreading.Example;

public class Test12 {
	public static void main(String[] args) {
	Test1  pm1 = new Test1("one");
	pm1.run();
	Test1 pm2 = new Test1("Second");
	pm2.run();
	}
}
class Test1 extends Thread
{
	private String sTname ="";
	 Test1(String s) {
	sTname = s;	
	 }
	 public void run()
	 {
		 for(int i= 0;i< 5;i++) {
			 try {
				 sleep(1000);
			 }catch(InterruptedException e) {}
			 Thread.yield();
			 System.out.println(sTname);
		 }
	 }
}