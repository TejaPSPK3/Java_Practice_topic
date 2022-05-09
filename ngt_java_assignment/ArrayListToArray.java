package ngt_java_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList languages1 = new ArrayList<>();

	    // Add elements in the list
	    languages1.add("Iron");
	    languages1.add("Steel");
	    languages1.add("Gold");
	    languages1.add("Platinum");
	    System.out.println("ArrayList: " + languages1);

	    // Create a new array of String type
	    String[] arr = new String[languages1.size()];

	    // Convert ArrayList into the string array
	    languages1.toArray(arr);
	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item+", ");
	    }
	    System.out.println("\n");
	    System.out.println("Convert java array to array list");
	   

	      // convert array to list
	      List languages= new ArrayList<>(Arrays.asList(arr));

	      System.out.println("List: " + languages);
	    
	}
}
