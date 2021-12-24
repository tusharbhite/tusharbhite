package Array;

import java.util.HashSet;
import java.util.Set;

public class A6union {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4 };

		int b[] = {3,4,5,6,7};
		
		Set<Integer> union=new HashSet<>();
		for(int i=0;i<a.length;i++)
			union.add(a[i]);
		for(int i=0;i<b.length;i++)
			union.add(b[i]);
		for(int i:union)
		{
			System.out.println(i);
		}
		

	}
	
}
