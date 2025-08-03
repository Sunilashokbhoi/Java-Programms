package com.collections.Tasks.day;

import java.util.Arrays;

public class SecondLastElement {
	public static void main(String[] args) {
		int arr[] = {12,43,2,34,11,4,6,73};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
	}
}
