package com.logical.stream_api;

import java.util.stream.Stream;

record Product(Integer id,String name) {
}
public class StreamDemo1 {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8);
		stream1.forEach(num ->System.out.println(num));
		
		Stream<String> stream2 = Stream.of("scott","Smith","Sunil","Raj");
		stream2.forEach(str->System.out.println(str));
		
		Product p1 = new Product(222,"Mobile");
		Product p2 = new Product(111, "Laptop");
		Product p3 = new Product(333, "Camera ");
		Product p4 = new Product(333, "Camera");
		Stream<Product> stream3 = Stream.of(p1,p2,p3,p4);
		stream3.forEach(prod ->System.out.println(prod));
	}
}
;