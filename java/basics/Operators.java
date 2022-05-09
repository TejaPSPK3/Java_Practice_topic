package com.java.basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 10;
		System.out.println("unary & Arithmatic operations");
		System.out.println(age++);  //prints 10
		//age=11
		System.out.println(++age);  //prints 12
		//age=12
		System.out.println(--age);   //prints 11
		//age=11
		System.out.println(age--);   //prints 11
		//age=10
		System.out.println(--age + age--);   //prints 9 + 9 =18
		//age=8
		System.out.println(age);
		System.out.println("Logical operators");
		boolean a = true,b = false, eq;
		eq = a && b;
		System.out.println("logical And ( && ) = "+eq);
		eq = a || b;
		System.out.println("logical OR ( || ) = "+eq);
		eq = a != b;
		System.out.println("logical Not ( ! ) = "+eq);
		 
		
	}

}
