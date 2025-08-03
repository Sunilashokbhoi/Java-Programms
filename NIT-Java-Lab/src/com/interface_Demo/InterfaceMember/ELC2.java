package com.interface_Demo.InterfaceMember;
interface Moveable1{
	
	void move();  //JDK 1.0
	
	default void m1() {
		m3();
		m4();
	}
	static void m2() //JDK 8V
	{
		m4();
	
	}
	private void m3()// JDK 9V [private non static method]
	{
		System.out.println("Private non static method of interfce ");
	}
	private static void m4() //JDK 9 [private static method]
	{
		System.out.println("Private static method of interface ");
	}
}
class Move implements Moveable1{
	@Override
	public void move() {
		System.out.println("It is moving");
	}
}
public class ELC2 {
	public static void main(String[] args) {
		Moveable1 m = new Move();
		m.move();
		m.m1();
		Moveable1.m2();
	   

	}
}
