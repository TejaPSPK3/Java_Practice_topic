package com.java.strings;

public class StringMutable {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("TejaPawanklayan");
		sb.append("kiran");
		System.out.println(sb.toString());
		sb.delete(4, 11);
		System.out.println(sb);
		
		StringBuilder sbu = new StringBuilder("Professor");
		sbu.append(" Star");
		System.out.println(sbu);
		System.out.println(sbu.reverse().toString());
	}
}
