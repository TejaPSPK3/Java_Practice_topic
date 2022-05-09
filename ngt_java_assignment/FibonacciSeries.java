package ngt_java_assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till what term");
		int n = sc.nextInt();
	    int f1 = 0, f2 = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(f1+", ");

	      // compute the next term
	      int nextTerm = f1 + f2;
	      f1 = f2;
	      f2 = nextTerm;
	     }
	    sc.close();
    }
}
