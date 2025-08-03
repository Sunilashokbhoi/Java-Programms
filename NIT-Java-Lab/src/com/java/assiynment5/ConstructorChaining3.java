package com.java.assiynment5;
class Count3{
	void Count4() {
		int i = 5;
		System.out.println("Output = ");
		for(int x = 0 ; x<=( i % 7);x +=1) {
			System.out.println(" "+ x);
		}
	}
}
class Count4 extends Count3{
	 Count4(){
		
	}
}
public class ConstructorChaining3 {
	public static void main(String[] args) {
		Count4 count = new Count4();
		count.Count4();
	}
}

