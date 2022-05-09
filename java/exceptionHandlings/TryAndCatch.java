package com.java.exceptionHandlings;

public class TryAndCatch {

	public static void main(String[] args) {
		
		int i=5,k=0,h;
		System.out.println("program strats");
		try {
			h = i/k;
			System.out.println(h);
			System.out.println("After exception");
		}catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();        	//this will give us an error occurs line in console
			System.out.println("Arithmatic execption handled");
			try {							//Nested try catch block in catch block
				int[] a = {32,12,3,5};
				System.out.println(a[6]);
			}catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("ArrayIndexOutOfBoundsException handled");
			}
		}
		catch(Exception e3)
		{
			System.out.println("All Exceptions are handled");
		}
		System.out.println("program ends");
	}

}
