package com.java.constructors;

class B
{
	int x;
	int y;
	int sum;
	public void result()
	{
		sum = x + y;
		System.out.println(sum);
	}
	public void result(int i, int j) 
	{
		sum = i + j;
		System.out.println(sum);
		
	}
	public void result(double d, double e) {
		sum = (int)(d + e);
		System.out.println(sum);
	}
	public int result(int k, int l, int m) 
	{
		sum = k + l + m;
		
		return sum;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		B b = new B();
		b.result();
		b.result(5,6);
		b.result(5.4,3.5);
		int d = b.result(8,9,3);
		System.out.println(d);
	}

}
