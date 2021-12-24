//Maximum and minimum of an array using minimum number of comparisons
package Array;

public class A2minmax {
public static void main(String[] args) {
	
	int a[]= {4,7,9,2,67,23,73,3,5};
	int min;
	int max;
	min=a[1];
	max=a[1];
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]<min)
		 {
			 min=a[i];
		 }
		 if(a[i]>max)
		 {
			 max=a[i];
		 }
	 }
	 System.out.println("MINIMUN: "+min);

	 System.out.println("MAXIMUM: "+max);
	 
}
}
