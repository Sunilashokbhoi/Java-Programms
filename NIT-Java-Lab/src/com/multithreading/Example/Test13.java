package com.multithreading.Example;

public class Test13 extends Thread {
	static Thread tf,ts;
	   public synchronized void run()
	   {
	       System.out.println(Thread.currentThread().getName()+"");
	       ts.start();
	   }

	public static void main(String[] args) {
		tf =new Thread(new Thread(),"SCJP");
		ts =new Thread(new Thread(),"SCJWD");
		tf.start();
		tf = new Test13();
		
	}
}
