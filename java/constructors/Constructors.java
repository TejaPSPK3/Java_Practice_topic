package com.java.constructors;

class A
{
	static
	{
		System.out.println("from static block 3");
	}
	int x;
	int y;
	int z;
	public void show()
	{
		System.out.println("from show "+z);   
	}
	public A()
	{
		x = 5;
		y = 7;
		z = x+y;
		System.out.println("From default constrictor");
	}
	static
	{
		System.out.println("from static block");
	}
	static
	{
		System.out.println("from static block 2");
	}
	public A(float k,int l)
	{
		x = (int)k;
		l = y;
		System.out.println("float to int value is : "+x);
	}
	public A(double h)
	{
		float i = (float)h;
		System.out.println("double value is : "+i);
	}
}


public class Constructors {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		A a = new A();
		A b = new A(3.4f,5);
		A c = new A(78.6d);
		a.show();
		
	}

}
