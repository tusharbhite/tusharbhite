package pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,j=1;
		int count=0;
		while(i<=n)
		{
			while(j<=n)
			{
				System.out.print(count+" ");
				count++;
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
		
	}
}
