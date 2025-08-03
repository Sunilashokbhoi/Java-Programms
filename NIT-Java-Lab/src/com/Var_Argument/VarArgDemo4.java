package com.Var_Argument;

import java.nio.channels.AcceptPendingException;

class Accept{
	
	public void acceptHetrogeneous(Object ...obj) {
		for(Object o : obj) {
			System.out.println(o);
		}
	}
}
public class VarArgDemo4 {
	public static void main(String[] args) {
		Accept al = new Accept();
		al.acceptHetrogeneous(12,23.90,'A',"NIT",new String("HYD"));
	}
}
