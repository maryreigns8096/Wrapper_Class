package com.wrapperclass;

public class ExplicitUnboxing {
	public static void main(String[] args) {
		int a=10;
		Integer i=new Integer(a);
		int b=i.intValue();
		System.out.println(b);
	}

}
