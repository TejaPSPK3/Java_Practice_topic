package com.java.typecasting;

public class ForPrimittive {

	public static void main(String[] args) {
		
		System.out.println("\"For Smaller data type to Longer data type\"");
		int a = 33;
		double b = a;
		float c = a;
		long d = a;
		System.out.println("in terms of int "+a);
		System.out.println("in terms of double "+b);
		System.out.println("in terms of float "+c);
		System.out.println("in terms of long "+d);
		System.out.println("for char ");
		char e = (char)a;
		System.out.println("in terms of char "+e);
		System.out.println("\"For Longer data type to Smaller data type\"");
		long i = 68;
		byte j = (byte)i;
		int k = (int)i;
		char l = (char)i;
		float m = (float)i;
		double n = (double)i;
		System.out.println("in terms of long "+i);
		System.out.println("in terms of byte "+j);
		System.out.println("in terms of int "+k);
		System.out.println("in terms of char "+l);
		System.out.println("in terms of float "+m);
		System.out.println("in terms of double "+n);

		
	}

}
