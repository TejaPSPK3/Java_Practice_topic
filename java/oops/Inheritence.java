package com.java.oops;

class Calculator
{
	public double add(double k,double l)
	{
		return k+l;
	}
}

class CalcAdv extends Calculator
{
	public double sub(double x,double y)
	{
		return x-y;
	}
}

class CalcVeryAdv extends CalcAdv 
{
	public double mul(double a,double b)
	{
		return a*b;
	}
}
public class Inheritence {

	public static void main(String[] args) {
		
		CalcVeryAdv c = new CalcVeryAdv();
		
		double res1 = c.add(5, 7);
		double res2 = c.sub(8, 6.3);
		double res3 = c.mul(3.2, 4.5);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);

	}

}
