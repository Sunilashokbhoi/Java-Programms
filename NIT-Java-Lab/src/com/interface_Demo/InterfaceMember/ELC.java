package com.interface_Demo.InterfaceMember;
interface Moveable {
	default] String toString() { //error becoz it is Oject class
		return "NIT";
	}
}
public class ELC {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	}
}
