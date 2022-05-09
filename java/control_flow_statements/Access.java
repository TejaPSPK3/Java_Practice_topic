package com.java.control_flow_statements;

@SuppressWarnings("unused")
public class Access {

	public int x = 10;    //when the variable is public it is used package level.
	private int y = 11;
	protected int z = 15;
	static int j = 6;
	final int k = 8;
	
	public class AccessInner
	{
		int a = 3;
		
	}
	
	
	private class AccInnPri
	{
		int b = 4;
		
	}
	
	protected class AccInnpro
	{
		int c = 5;
	}
	
	static class AccInnSta
	{
		int d = 6;
	}
	
	final class AccInnFin
	{
		int e = 7;
	}
	
	public void met1()
	{
		int meta = 2;
	}
	private void met2()
	{
		int metb = 3;
	}
	protected void met3()
	{
		int metc = 4;
	}
	static void met4()
	{
		int metd = 5;
	}
	final void met5()
	{
		int mete = 6;
	}
}
@SuppressWarnings("unused")
final class A
{
	public int d = 4;
	private int f =9;
	protected int s = 8;
	
	public void abc() {
		System.out.println("hii");
		final int a =2;                  
		int b=6,c;
		c = a + b;
		System.out.println(c);
	}
}
@SuppressWarnings("unused")
class Main
{
	public static void main(String[] args) {
		
		Access acl = new Access();
		acl.x = 12;
		//acl.y = 13;   (when the variable is private we use only within class)
		acl.z = 16;
		Access.j = 7;
		int k = Access.j + acl.k;
		System.out.println(k);
		 		Access.AccessInner aclInner = new Access().new AccessInner();
		 		//                   or
		 		Access.AccessInner aclInne =  acl.new AccessInner();
		 		aclInner.a = 6;
		//Access.AccInnPri acinpr = acl.new AccInnpri(); (Private class within a class)
		 		//Access.AccInnPro aclInnPro =  acl.new AccInnPro(); (protected class within a class)
		 	
		 		
		A defaulta = new A();
		defaulta.abc();
		
		acl.met1();
		acl.met3();
		Access.met4();
		acl.met5();
	}
}