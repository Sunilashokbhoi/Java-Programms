package com.multithreading.tasks;

public class Car implements Runnable{
		private String name;
		private PetrolPump petrolPump;
		public Car(String name ,PetrolPump petrolPump) {
			this.name = name;
			this.petrolPump = petrolPump;
		}
		
	public void run() {
			petrolPump.refillCar(name);
		}
	
}
