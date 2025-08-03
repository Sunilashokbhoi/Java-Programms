package com.java.assiynment5;

class Count extends Count2{
	Count(){
			
		}
	}
class Count2{
	void count(){
		System.out.println("Output = ");
		for(int x = 0; x<7 ; x++ ,x++) {
			System.out.println(" "+x);
		}
	}
}
public class ConstructorChain2 {
	public static void main(String[] args) {
	Count t = new Count();
	t.count();
}
}
