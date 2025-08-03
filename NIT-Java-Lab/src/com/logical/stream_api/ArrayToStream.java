package com.logical.stream_api;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayToStream {
	public static void main(String[] args) {
		int arr1[] = {10,15,30,35,50};
		IntStream stream1 = Arrays.stream(arr1);
		stream1.forEach(num -> System.out.println(num));
		System.out.println("-----------------------");
		
		long arr2[] = {101,102,103,104};
		LongStream stream2 = Arrays.stream(arr2);
		stream2.forEach(doub -> System.out.println(doub));
		System.out.println("-----------------------");

		double arr3[] = {1.2,8.9,4.9};
		DoubleStream steam3 = Arrays.stream(arr3);
		steam3.forEach(num ->System.out.println(num));
	}
	
}
