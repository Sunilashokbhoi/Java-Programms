package com.interface_Demo;
sealed interface Moveble {
	int SPEED = 100; //public + static + final
    void move();   //public + abstract
}
final class Car implements Moveble
{
	public void move() {
		//SPEED = 200;
		System.out.println("car speed is "+SPEED);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Moveble m = new Car();
		m.move();
		System.out.println("Speed of the Car is :"+Moveble.SPEED);
	}
}
