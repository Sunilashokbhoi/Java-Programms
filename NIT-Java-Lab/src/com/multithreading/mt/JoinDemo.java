package com.multithreading.mt;
class Join extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+ "Thread started ");
		
		for(int i =1;i<=5;i++) {
			System.out.println("i value is :"+i+"by name "+name+" thread");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name +"Thread ended");
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		Join j1 = new Join();
		Join j2 = new Join();
		Join j3 = new Join();
		
		j1.setName("j1");
		j2.setName("j2");
		j3.setName("j3");
		
		j1.start();
		System.out.println("Main Thread is going to block");
		j1.join();
		System.out.println("Main Thread Wake Up ..");
		j2.start();
		j3.start();
	}
}
