package com.interface_.Default_Method;
@FunctionalInterface
interface Vehicle1 {
	void run();

}
public class MultilpleInheritance2 {
public static void main(String[] args) {
	Vehicle1 car = new Vehicle1() {
		public void run() {
			System.out.println("Car is Running ");
		}
	};
	Vehicle1 bike = new Vehicle1() {
		
		@Override
		public void run() {
			System.out.println("Bike is Running ");			
		}
	};
      car.run();
      bike.run();
			
}
}
