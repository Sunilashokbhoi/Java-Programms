package com.interface_Demo;
interface HotDrink{
	void prepare();
}
//New class Tea
class Tea implements HotDrink{
	public void prepare() {
		System.out.println("Preparing Tea");
	}
}
//New class Coffee
class Coffee implements HotDrink{
	public void prepare() {
		System.out.println("Preparing Coffee");
	}
}
//New class Boost
class Boost implements HotDrink{
	public void prepare() {
		System.out.println("Preparing Boost");
	}
}

//New Class Horlicks
class Horlicks implements HotDrink{
	public void prepare() {
		System.out.println("Pareparing Horlick");
	}
}

//New Class Restaurant 
class Restaurant {
	public static void acceptObject(HotDrink hd) {
		hd.prepare();
	}
}
//New Main Class
public class LooseCoupling {
	public static void main(String[] args) {
		Restaurant.acceptObject(new Tea());
		Restaurant.acceptObject(new Coffee());
		Restaurant.acceptObject(new Horlicks());
		Restaurant.acceptObject(new Boost());
	}
}
