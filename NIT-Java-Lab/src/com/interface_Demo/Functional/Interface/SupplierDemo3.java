package com.interface_Demo.Functional.Interface;
import java.util.function.Supplier;
record Manager(Integer managerId , String managerName) {
	
}
public class SupplierDemo3 {
	public static void main(String[] args) {
		Supplier<Manager> s3 = ()-> new Manager(111,"John");
		System.out.println(s3.get());
		
		//Record class used
		Manager m1 = new Manager(112,"Sunil");
		System.out.println(m1);
	}
}
