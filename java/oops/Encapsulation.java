package com.java.oops;

class City
{
	private String mla;
	private int salary;
	
	public String binding()
	{
		return mla;
	}

	public String getMla() {
		return mla;
	}

	public void setMla(String m) {
		mla = m;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int s) {
		salary = s;
	}

	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		City city = new City();
		city.setMla("Amanchi");
		city.setSalary(90000);
		System.out.println(city.binding());
		System.out.println(city.getMla());
		System.out.println(city.getSalary());
	}
}
