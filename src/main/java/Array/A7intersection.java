package Array;

import java.util.HashSet;
import java.util.Set;

public class A7intersection {
public static void main(String[] args) {
	

	int a[] = {1,2,3,4 };

	int b[] = {3,4,5,6,7};
	
	int m=a.length;
	int n=b.length;
	
	int i=0,j=0;
	
	Set<Integer> intersection=new HashSet<>();
	
	while(i<m && j<n)
	{
		if(a[i]<b[j])
			i++;
		else if(a[i]>b[j])
			j++;
		else { intersection.add(b[j]);
		i++;j++;
		}
		
	}
	for(Integer k:intersection)
	System.out.println(k);

}
	
}
