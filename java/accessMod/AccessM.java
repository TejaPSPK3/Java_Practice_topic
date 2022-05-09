package com.java.accessMod;

import com.java.control_flow_statements.Access;

public class AccessM {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Access publicacp = new Access(); 
		/*if the class is public then we use 
		 *outside package also by importing*/
		publicacp.x = 8;

		Access.AccessInner publicinnercl = publicacp.new AccessInner();
		/*acces the public inner class in outside package also*/
		
		
		//A defaulta = new A();
		/*if the class is default then we use
		 * with the same package*/
		 
		publicacp.met1();
		
		
	}
}


