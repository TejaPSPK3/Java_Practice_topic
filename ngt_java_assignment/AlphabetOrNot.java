package ngt_java_assignment;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter an alphabet: ");
		char c=sc.next().charAt(0);
		sc.close();
		if(( c>='a' && c<='z')||(c>='A' && c<='Z'))
		{
			System.out.println(c+ " is an alphabet");
		}
		else
		{
			System.out.println(c+ " is not an alphabet");
		}
	}
}
