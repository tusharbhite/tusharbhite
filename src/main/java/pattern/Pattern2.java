package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//Approach 1		
		int i=1,j=n;
		while(i<=n)
		{
			while(j>0)
			{
				System.out.print(j+" ");
				j--;
			}
			System.out.println();
			j=n;
			i++;
		}
		
		
		
		//OR//
//Approach 2 
		System.out.println();
		j=1;i=1;
		while(i<=n)
		{
			while(j<=n)
			{
				System.out.print(n-j+1+" ");
				j++;
			}
			System.out.println();
			j=1;
			i++;
		}
		
	}
}
