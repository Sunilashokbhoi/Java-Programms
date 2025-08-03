package com.interface_Demo.Bipredefined.Function;

public class Lambda11 {
	public static void main(String[] args) {
		BiPredicate<String, Integer> filter = (x, y) ->
		{
			return x.length() == y;
		};
		boolean result = filter.test("Ravi",4);
		System.out.println(result);
		result = filter.test("Hyderabad",10);
		System.out.println(result);
	}
}
