package com.java.oops;

class Student extends Human
{
	public void write()
	{
		System.out.println("i'm in Student");
	}
}

class Teacher extends Human
{
	public void write()
	{
		System.out.println("i'm in Teacher");
	}
}

abstract class Human
{
	abstract void write();      //when abstract method declation is there its child must have method implementation
}
public class Abstraction {

	public static void main(String[] args) {
		
		Student s = new Student();
		Teacher t = new Teacher();
		s.write();
		t.write();
	}

}
