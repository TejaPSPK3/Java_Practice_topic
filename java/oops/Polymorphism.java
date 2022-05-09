package com.java.oops;

class Calculators
{
	int i=5,j=4,k;
	public void sample()
	{
		k = i+j;
		System.out.println("hii "+k);
	}
}

class Casio extends Calculators
{
	int a=2,b=4,c;
	public void sample()      //METHOD OVERRIDING (RUNTIME POLYMORPHISM)
	{
		c = a+b;
		System.out.println("hello "+c);
	}
}

class MethodOverload
{
	public int mo(int k,int l)						//METHOD OVERLOADING (COMPILETIME POLYMORPHISM)
	{
		return k+l;
	}
	public double mo(double i,double j)
	{
		return i+j;
	}
	public double mo(double a,double b,double c)
	{
		return a+b+c;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		Casio casio = new Casio();
		casio.sample();
		
		MethodOverload mol = new MethodOverload();
		System.out.println(mol.mo(4.3, 5.3));
		System.out.println(mol.mo(3, 7));
		System.out.println(mol.mo(2.3, 4.5, 6.7));

	}

}
