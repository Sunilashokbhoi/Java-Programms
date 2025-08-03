package com.collections.Tasks.day2;

import java.util.Arrays;
import java.util.Scanner;



record Customer(int id, String name, double bill) {
}

public class CustomerComaparator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Array Size");
		int size = sc.nextInt();
		Customer[] customers = new Customer[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Customer Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Customer Name : ");
			String name = sc.next();
			System.out.println("Enter Customer Bill : ");
			double bill = sc.nextDouble();

			customers[i] = new Customer(id, name, bill);
		}
		Arrays.sort(customers,(c1,c2)->Integer.compare(c1.id(),c2.id()));
		System.out.println("Sorting customer base on id ");
		for(Customer cust : customers) {
			System.out.println(cust);
		}
		System.out.println("------------");
		Arrays.sort(customers,(c1,c2)->c1.name().compareTo(c2.name()));
		System.out.println("Sorting customer by using Name : ");
		for(Customer cust1:customers) {
			System.out.println(cust1);
		}
		System.out.println("--------------");
		Arrays.sort(customers,(c1,c2)->Double.compare(c1.bill(), c2.bill()));
		for(Customer cust2 : customers) {
			System.out.println(cust2);
		}
	}
}
