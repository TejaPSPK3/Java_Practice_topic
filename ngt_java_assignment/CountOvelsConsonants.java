package ngt_java_assignment;

import java.util.Scanner;

public class CountOvelsConsonants {

	public static void main(String[] args) 
	{
		
		String sent;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the sentence: ");
		sent=sc.nextLine();
		sc.close();
	    int vowels = 0, consonants = 0;
	    sent = sent.toLowerCase();
	    for (int i = 0; i < sent.length(); ++i) 
	    {
	    	char ch = sent.charAt(i);
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	      {
	        ++vowels;
	      }
	      else if ((ch >= 'a' && ch <= 'z')) 
	      {
	        ++consonants;
	      }
	    }
	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	}
}
