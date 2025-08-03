package com.Wrapper_Class.immutable.AutoBoxing;

public class AutoBoxing2 {
	public static void main(String[] args) {
		byte b = 12;
		Byte b1 = Byte.valueOf(b);
		System.out.println("Byte Objet "+b1);
		
		short s =15;
		Short s1 = Short.valueOf(s);
		System.out.println("Short Object "+s1);
		
		int i =90;
		Integer i1 = Integer.valueOf(i);
		System.out.println("Integer Object "+i1);
		
		long l = 12;
		Long l1 = Long.valueOf(l);
		System.out.println("Long Object "+l1);
		
		float f = 2.4f;
		Float f1 = Float.valueOf(f);
		System.out.println("Floate Object :"+f1);
		
		double d = 90.90d;
		Double d1 = Double.valueOf(d);
		System.out.println("Double Object "+d1);
		
		char c = 'A';
		Character ch1 = Character.valueOf(c);
		System.out.println("Character Object "+ch1);
		
		boolean bl = true;
		Boolean bl1 = Boolean.valueOf(bl);
		System.out.println("Booleab Object "+bl1);
	}
}
