package ngt_java_assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the table number: ");
		int num=sc.nextInt();
		System.out.print("Enter the number of times: ");
		int times =sc.nextInt();
		sc.close();
        for(int i = 1; i <= times; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
	}
}
