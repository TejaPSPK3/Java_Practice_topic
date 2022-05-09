package com.java.strings;

public class StringPool {

	public static void main(String[] args) {
		
		String s = new String("abc");  //in runtime when the new word finds to create the object in
									   //heap and then for String("abc") it creates abc in 
										//string constant pool but s refers only the object in heap.
		
		String s1 = "abc";//(it will stores abc in String constant pool)
		
		System.out.println(s==s1);// s refers object abc in heap and s1 refers abc in 
									//str pool so they are false
		
		String s2 = new String("abc");//it creates another object in heap butin str pool it didnt
										//store abc again it point the same data previously stores 
										//so s and s2 points two diff objects so false.
		System.out.println(s==s2);
		String s3 = new String("abc");
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		String s4 = "abc";
		System.out.println(s1==s4);
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2==s3);
		System.out.println(s3+" "+s2);
		System.out.println(s3==s4);
		s3 = new String("abc").intern();
		System.out.println(s3==s4);
		
	
	}
}
