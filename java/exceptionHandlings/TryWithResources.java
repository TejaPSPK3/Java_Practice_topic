package com.java.exceptionHandlings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws Exception {     //for buffer reader error 
		                                                          // wecan write throws Exception
		
		System.out.println("Program starts");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
		//By this resoure in try no need of catch and if Exception occurs then bufer reader also closes
		{
			String str = "";
			str = br.readLine();     //Without throws an exception occurs(THESE ARE CHECKED EXCEPTIONS)
			System.out.println(str);
		}
		System.out.println("Program ends");
		
	}

}
