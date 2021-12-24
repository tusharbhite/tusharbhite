package pattern;

import java.util.Scanner;

public class Pattern12 {
public static void main(String[] args) {
	
	System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1,j=1;
	int count=1;
	char a='A';
	
	while(i<=n)
	{
		j=1;
		while(j<=n)
		{
			System.out.print(i-j+1+ " ");
			j++;
		}
		i++;
		System.out.println();
	}
	
	
}
}
