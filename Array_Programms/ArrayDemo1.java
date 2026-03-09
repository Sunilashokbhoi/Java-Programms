package arrays.day3;

import java.util.Arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] arr = {12,13,15,11,28,33,42,14};
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------");

		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println("--------");
		System.out.println(Arrays.toString(arr));
	}
	
	
}
