package com.java.control_flow_statements;

import java.util.Scanner;

public class Conditions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println("IF CONDITION");
		if(a%2 == 0)
			System.out.println("if statement works");
		
		System.out.println();
		System.out.println("IF-ELSE CONDITION");
		if(a<=10)
			System.out.println("yes "+a+" is not greater than 10");
		else
			System.out.println("no "+a+" is greater than 10");
		
		System.out.println();
		System.out.println("IF ELSE-IF CONDITION");
		if(a == 1)
			System.out.println("yes "+a+" = 1");
		else if (a <= 5 && a > 1) 
			System.out.println("yes "+a+" is in betwn 1 to 5");
		else if (a <=10 && a > 5)
			System.out.println("yes "+a+" is in betwn 5 to 10");
		else
			System.out.println("the given "+a+" is greater than 10");
		
		System.out.println();
		System.out.println("TERENARY OPERATOR");
		int b = 5, c = 6,d;
		d = b>c?1:0 ;
		System.out.println("ternary operator works");
		
		System.out.println();
		System.out.println("SWITCH CONDITION");
		int x = 20;
		switch (x) {
		case 18: System.out.println("case 1 works as 18");
				break;
		case 19: System.out.println("case 2 works as 19");
				break;
		case 20: System.out.println("case 3 works as 20");
				break;
		case 21: System.out.println("case 3 works as 21");
				break;
		default:
			System.out.println("the number is invalid");
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
		
	}

}
