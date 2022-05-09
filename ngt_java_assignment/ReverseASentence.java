package ngt_java_assignment;

import java.util.Scanner;

public class ReverseASentence {

	public static void main(String[] args) 
	 {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence=sc.nextLine();
		sc.close();
	    String revsen = reverse(sentence);
	    System.out.println("Reversed format: " + revsen);
	  }
	  public static String reverse(String sentence) 
	  {
	    if (sentence.isEmpty())
	    {
	      return sentence;
	    }
	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	  }
}
