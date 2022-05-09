package ngt_java_assignment;

public class ZeroesToEnd {

	public static void main(String[] args) {
		
		int arr[] = {19,0,72,0,63,45,0,89};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
	}
	    // Function which pushes all zeros to end of an array.
	    static void pushZerosToEnd(int arr[], int n)
	    {
	        int count = 0;  // Count of non-zero elements
	        for (int i = 0; i < n; i++)
	            if (arr[i] != 0)
	                arr[count++] = arr[i]; 
	        
	        while (count < n)
	            arr[count++] = 0;
	    }
}
