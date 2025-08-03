package com.java.InstanceVariableInitializationOrder;
class LIC 
{
	final double installer = 1;
}

public class BlankFinalFieldDemo1 {
	public static void main(String[] args) {
		LIC l = new LIC();
		System.out.println(l.installer);
	}
}

//A blank final field can't be initialized by default constructor.