package com.java.exceptionHandlings;

public class UserDefinedExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int i=5,j=8,h;
		h=i/j;
		System.out.println(h);
		try {
			if(i<j)
			{
				throw new MyException("Errorr: i must be greater than j");
			}
			
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("User defined exception Handled");
		}	
	}
}

@SuppressWarnings("serial")
class MyException extends Exception
{
	public MyException(String str)
	{
		super(str);
	}
}
