package ngt_java_assignment;

import java.util.ArrayList;

public class ListIntoArray {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
	      list.add("shirt");
	      list.add("pant");
	      list.add("suit");

	      System.out.println("Contents of list ::"+list);
	      String[] myArray = new String[list.size()];
	      list.toArray(myArray);

	      for(int i=0; i<myArray.length; i++){
	         System.out.println("Element at the index "+i+" is ::"+myArray[i]);
	      }
	}
}
