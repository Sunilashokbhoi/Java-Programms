package com.multithreading;
record Product(Integer productId , String productName) {
	@Override
	public void finalize() {
		System.out.println("Product Object is eligible for GC..");
	}
}
public class FinalizeDemo {
	public static void main(String[] args)throws InterruptedException {
		Product p1 = new Product(111,"Laptop");
		System.out.println(p1);
		p1 = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(p1);
	}
}
