package com.interface_Demo.Bipredefined.Function;

public class Lambda12 {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> isSumEven = (a,b) -> (a + b)% 2 == 0;;
		System.out.println(isSumEven.test(2,3));
		System.out.println(isSumEven.test(5,7));
	}
}
