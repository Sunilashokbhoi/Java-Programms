package com.java.InstanceVariableInitializationOrder;
class Demo{
	final int x ;
	{
		print();
		x = 222;
	}
	public void print() {
		System.out.println("Default Value :"+x);
	
	}
}
public class BlankFinalFieldDemo4 {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("User Value :"+d.x);

	}

}
//A blank final field also have default value.