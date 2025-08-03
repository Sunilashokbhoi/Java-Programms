package com.multithreading.tasks;

public class PetrolPump {
	public synchronized void refillCar(String carName) {
		System.out.println(carName+" started refilling... ");
		try {
		Thread.sleep(3000);
		System.out.println(carName+" completed refilling!");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
