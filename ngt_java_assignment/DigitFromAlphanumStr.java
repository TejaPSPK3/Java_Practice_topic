package ngt_java_assignment;

public class DigitFromAlphanumStr {

	public static void main(String[] args) {
        String str = "I Said342 is not a 89PrimNu72mber"; 
        System.out.print(getNbr(str)); 
	  }

		  
	    static String getNbr(String str) 
	    { 
	        // Replace each non-numeric number with a space
	        str = str.replaceAll("[^\\d]", " "); 
	        // Remove leading and trailing spaces
	        str = str.trim(); 
	        // Replace consecutive spaces with a single space
	        str = str.replaceAll(" +", " "); 
	  
	        return str; 
	    } 
}
