package com.java.InstanceVariableInitializationOrder;
class Foo{
	final int x;
	/*{
		x=300;
	}*/
	public Foo() {
		x=123;
	}
}
public class BlankFinalFieldDemo3 {

	public static void main(String[] args) {
		Foo f =  new Foo();
		System.out.println(f.x);

	}

}

//A blank final field must be initialized inside non static block OR inside constructor body.