package com.java.exceptionHandlings;

public class Finally {

	public static void main(String[] args) {
		
		int i=4,k=0,h;
		System.out.println("Program starts");
		try {
			h=i/k;
			System.out.println(h);
		} catch(ArrayIndexOutOfBoundsException e) {    //Arithmatic Ec=xception not handled
			System.out.println("Exception handled only for ArrayIndexOutOfBoundsException");
		}
		finally {
			System.out.println("Whether Exception occurs or not, if it is handled or not\n Finally block defnitily prints");
		}
		System.out.println("Program ends");
	}

}
