package pattern;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=0,j=0;
	while(i<n)
	{
		i++;

		//System.out.println(i);
		while(j<n)
		{
			j++;
			System.out.print(j+" " );
		}
		j=0;
		System.out.println();
	}
}
}
