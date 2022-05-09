package com.java.typecasting;

import java.text.DecimalFormat;
import java.text.ParseException;

public class StringAndInt {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		System.out.println("INT TO STRINGS");
		int a = 23;
		String s = String.valueOf(a);
		System.out.println(s);
		String s1 = Integer.toString(a);
		System.out.println(s1);
		String s2 = String.format("%d", a);
		System.out.println(s2);
		
		System.out.println();
		System.out.println("STRING TO INT");
		String str = "5375";
		int x = Integer.valueOf(str);
		System.out.println(x);
		int y = Integer.parseInt(str);
		System.out.println(y);
		int z = new Integer(str).intValue();
		System.out.println(z);
		DecimalFormat decimalFormat = new DecimalFormat("#");
		try {
			int xyz =  decimalFormat.parse(str).intValue();
			System.out.println(xyz);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
	}

}
