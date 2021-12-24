package pattern;

import java.util.Scanner;

public class Pattern8 {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1,j=1;
	int count=1;
	
//	while(i<=n)
//	{
//		j=1;
//		int k=i;
//		while(j<=i)
//		{
//			System.out.print(k-- + " ");
//			j++;
//		}
//		i++;
//		System.out.println();
//	}
	
	while(i<=n)
	{
		j=1;
		while(j<=i)
		{
			System.out.print((i-j+1) + " ");
			j++;
		}
		i++;
		System.out.println();
	}
}
}
