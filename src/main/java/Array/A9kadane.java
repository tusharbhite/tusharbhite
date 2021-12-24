package Array;

import java.util.Arrays;

public class A9kadane {
	public static void main(String[] args) {
		int[]arr= {-2, -3, 4, -1, -2, 1, 5, -3};
		int n=arr.length;
		 long max_so_far = arr[0];
		    long curr_max = arr[0];
		 
		    for (int i = 1; i < n; i++)
		    {
		           curr_max = Math.max(arr[i], curr_max+arr[i]);
		        max_so_far = Math.max(max_so_far, curr_max);
		    }
		    System.out.println( Math.max(max_so_far, curr_max));
		    }
	}
	


