package com.java.exceptionHandlings;

public class ThrowAndThrows {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		try {
			int i=4,j=5,l;
			l = i/j;
			System.out.println(l);
			if(i<j)
			{
				throw new ArithmeticException("i should greater than j");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException was handled");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
			 e.printStackTrace();
		}
		finally {
			System.out.println("Done with throw ");
		}
		System.out.println("Program ends");
		
	}

}
