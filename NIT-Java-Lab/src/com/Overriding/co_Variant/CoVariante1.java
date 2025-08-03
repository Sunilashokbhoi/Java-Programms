package com.Overriding.co_Variant;
class Alpha{
	
}
class Beta extends Alpha{
}
class Bird{
	public Alpha fly()
	{
		System.out.println("Generic Bird is flying");
		return new Alpha();
	}
}
class Parrot extends Bird{
	public Beta fly() {
		System.out.println("Parrot Bird is flying");
		return new Beta();
	}
}
public class CoVariante1 {
	public static void main(String[] args) {
		Bird b = new Parrot();
		b.fly();
	}
}
