package com.collections.Tasks.day;

public class Assending {
public static void main(String[] args) {
	int arr[] = {12,43,67,54,12,98,5,32};
	int temp = 0;
	for(int i=0;i<arr.length;i++) {
		
		for(int j=0+i;j<arr.length;j++) {
			
			if(arr[i]>arr[j]) {
				temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
	}
	for(int as : arr) {
		System.out.println(as);
	}
}
}
