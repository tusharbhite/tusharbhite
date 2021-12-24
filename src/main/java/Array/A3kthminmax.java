package Array;

import java.util.Arrays;

//Kth smallest number in array
public class A3kthminmax {
public static void main(String[] args) {
	
	
	int a[]={23,67,25,90,45,62,10};
	int k=3;
    // the sorted array

	Arrays.sort(a);
	 
    System.out.println( a[k - 1]);//smallest
    System.out.println( a[a.length-k]);//largest

	
	

	
}
}
