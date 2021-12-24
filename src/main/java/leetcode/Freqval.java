package leetcode;

public class Freqval {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		int n=arr.length;
		decompress(arr,n);
	}
	
	static void decompress(int [] arr,int n) {
		 int i=0,freq=0,val=0,j=0;
	        int nums[]=new int[arr.length];

	        while(i<arr.length-1)
	        {
	            freq=arr[i];
	            val=arr[i+1];
	            System.out.println("i"+i+"freq="+freq+" val="+val);
	            for(int k=0;k<freq;k++)
	            {
	            	if(i<=n && j<=n)
	            	{
	                nums[j]=arr[2*i];
	                j++;
	                System.out.println(nums[j]);

	            	}
	            }
	            
	            i+=2;
	            
	            
	            
	        }
	        for(int z:nums)
	        {
	        	System.out.println(z);
	        }
		
	}
}
