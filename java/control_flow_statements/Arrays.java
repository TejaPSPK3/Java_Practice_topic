package com.java.control_flow_statements;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1D ARRAYS");
		int[] Array1D = new int[5];
		for(int i=0;i<Array1D.length;i++)
		{
			Array1D[i] = sc.nextInt();
		}
		for(int i=0;i<Array1D.length;i++)
		{
			System.out.print(Array1D[i]+" ");
		}
		System.out.println();
		System.out.println("Enhanced for \"loop\" for an 1D Array");
		for(int enf : Array1D)
		{
			System.out.print(enf+" ");
		}
		
		
		System.out.println();
		System.out.println("2D ARRAYS");
		int[][] Array2D = new int[3][3];
		for(int i=0;i<Array2D.length;i++)
		{
			for(int j=0;j<Array2D[i].length;j++)
			{
				Array2D[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<Array2D.length;i++)
		{
			for(int j=0;j<Array2D[i].length;j++)
			{
				System.out.print(Array2D[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enhanced for \"loop\" for an 2D Array");
		for(int[] enf2d : Array2D)
		{
			for(int val : enf2d)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
