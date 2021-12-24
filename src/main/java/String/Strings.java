package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Strings {

	public static void main(String[] args) {
	//	int[][] arr = new int[3][3];
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		int swap[]=new int[2];
		int swapIndex=0;
		
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==n/2)
                    continue;
                else {
                	System.out.println(arr[i][j]);
                	swap[swapIndex++]=arr[i][j];
                	
                }
                
            }
            swap[0] = swap[0] + swap[1] - (swap[1] = swap[0]);
        }
		
		
		for(int []a:arr)
		{
			for(int b:a)
				{System.out.print(b);
				}
			System.out.println();
		}		
	}
}
