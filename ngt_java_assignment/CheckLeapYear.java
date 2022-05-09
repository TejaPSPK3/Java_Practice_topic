package ngt_java_assignment;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the year: ");
		int year=sc.nextInt();
		sc.close();
	    boolean result = false;
	    if (year % 4 == 0) 
	    {
	       if (year % 100 == 0) 
	       {
	        if (year % 400 == 0)
	        	result = true;
	        else
	        	result = false;
	       }
	      else
	    	  result = true;
	    }	    
	    else
	    	result = false;

	    if (result)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	}
}
