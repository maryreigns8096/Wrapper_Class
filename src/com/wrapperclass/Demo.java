package com.wrapperclass;

public class Demo {
	public static void main(String[] args) {
		
	
	int i=0;
	System.out.println(i);
	
	
	Integer a=new Integer(i);
	System.out.println(a); //boxing
	
	int b=a; //unboxing
	System.out.println(b);
	
	}

}
