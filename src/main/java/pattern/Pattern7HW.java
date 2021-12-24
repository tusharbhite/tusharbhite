package pattern;

import java.util.Scanner;

public class Pattern7HW {
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
			System.out.print(i);
		
			
			j++;
		}
		
		i++;
		System.out.println();
	}
	
	
//	while(i<=n)
//	{
//		j=1;
//		int k=i;
//		while(j<=i)
//		{
//			System.out.print(k++ +" ");
//			
//			j++;
//		}
//		k=0;
//		
//		i++;
//		System.out.println();
//	}
}
}
