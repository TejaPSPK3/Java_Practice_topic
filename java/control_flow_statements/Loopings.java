package com.java.control_flow_statements;

public class Loopings {

	public static void main(String[] args) {
		
		int c = 0;
		for(int i=0; i<10; i++)
		{
			c = 3 + i;
		}
		System.out.println(c);
		int i = 0;
		while(i<10)
		{
			c = 2 + i;
			i++;
		}
		System.out.println(c);
		do
		{
			c = 2 + i;
			i++;
		}while(i<12);
		System.out.println(c);
		
		
	}

}
