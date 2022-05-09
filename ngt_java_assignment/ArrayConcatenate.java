package ngt_java_assignment;

import java.util.Arrays;

public class ArrayConcatenate {

	public static void main(String[] args) 
	{
		int[] arr1 = {5, 2, 8};
        int[] arr2 = {4, 5, 6};

        int len1 = arr1.length;
        int len2 = arr2.length;
        int len=len1+len2;
        int[] result = new int[len];

        System.arraycopy(arr1, 0, result, 0, len1);
        System.arraycopy(arr2, 0, result, len1, len2);
        System.out.println(Arrays.toString(result));
	}

}
