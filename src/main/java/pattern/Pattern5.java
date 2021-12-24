package pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,j=1;
		int count=0;
		
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(i+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}
	
}
