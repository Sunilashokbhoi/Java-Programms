package com.Overriding.Intance_Operators;
class Bird{
	public void fly() {
		System.out.println("Bird Flying");
	}
}
class Fish {
	public void swing() {
		System.out.println("Fish is swimming ");
	}
}
public class InstanceOfDemo2 {
	public static void main(String[] args) {
	Fish f = new Fish();
	if(f instanceof Bird) { //instabceof operator is required to HAS-A relation
								//otherwise it is compilation error
	}
	}
}
