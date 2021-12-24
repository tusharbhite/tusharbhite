package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class As {
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5,6};
		int n=arr.length;
		int sum=0;
		int k=0;
		
		
	    for(int i=0;i<n;i++)
	    {
	    	//System.out.println("@"+arr[i]);
	    	System.out.println();
	        for(int j=i;j<n;j++)
	        {
	        	
	        	
	        		System.out.print( ""+arr[j]);
	        
	            //System.out.print( ""+arr[j]);
	            sum+=arr[j];
	        }
	        	System.out.println("Sum is "+sum);
	        	if(sum==0)
	        		System.out.println("ZERO");
	        sum=0;
	    
		}

	    for(int i=n-1;i>0;i--)
	    {
	    	//System.out.println("@"+arr[i]);
	    	System.out.println();
	        for(int j=i;j>=0;j--)
	        {
	        	
	        	
	        		System.out.print( ""+arr[j]);
	        
	            //System.out.print( ""+arr[j]);
	            sum+=arr[j];
	        }
	        System.out.println("Sum is "+sum);
        	if(sum==0)
        		System.out.println("ZERO");
        sum=0;	    
		}

	    
	    
		
	}
	
	
}