package com.java.typecasting;

class Parent
{
	void showP()
	{
		System.out.println("From parent class show mthod");
	}
	void display()
	{
		System.out.println("From parent class display method");
	}
}

class Child extends Parent
{
	void showP()
	{
		System.out.println("From child class show method");
	}
	void print()
	{
		System.out.println("From child class print method");
	}
}
public class ForNonPrimittive {

	public static void main(String[] args) {
		System.out.println("With parent ref & parent object");
		Parent p = new Parent();
		p.showP();
		p.display();
		System.out.println();
		
		System.out.println("With child ref & child object");
		Child c = new Child();
		c.showP();
		c.print();
		c.display();
		System.out.println();
		
		System.out.println("With parent ref & child object is called \"*up casting*\"");
		Parent pc = new Child();
		pc.showP();
		//pc.print();
		pc.display();
		System.out.println();
		
		System.out.println("\"*WE ARE UNABLE TO MAKE DOWN CASTING IN NON-PRIMITTIVE TYPE DATATYPES*\"");
	}

}
