package Array;

import java.util.Arrays;
//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
public class A4sort012 {
    public static void sort012(int a[], int n)
    {
        // code here
   Arrays.sort(a);
//        for(int i:a) 
//        System.out.println(i);
    }
    public static void main(String[] args) {
    		int a[]= {1,2,0,1,2,0,1,0,2};
    	sort012(a, 3);
    	int n=a.length;
    	int i=0,j=0,k=n-1;
		while(j<=k)
		{
			switch(a[j])
			{
			case 0:a[i]=a[i]+a[j]-(a[j]=a[i]);
					i++;
					j++;
					break;
				   
			case 1:j++;
			break;
						
			case 2:a[j]=a[j]+a[k]-(a[k]=a[j]);
			k--;
			}
		}
		for(int x:a)
		System.out.println(x);
	}

}
