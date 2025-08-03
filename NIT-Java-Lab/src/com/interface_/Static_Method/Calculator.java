package com.interface_.Static_Method;

public interface Calculator {
	static double getCube(int num) {
		return (num*num*num);
	}
	static double getSquare(int num) {
		return (num*num);
	}
}
