//reverse an array
package Array;

public class A1reverse {
	public static void main(String []args){

        
        int a[]={1,2,3,9,5,0,2,6,8};
        int len=a.length;
        int l=0,r=len-1,temp;
        
        while(l<r)
        {
        	temp=a[l];
        	a[l]=a[r];
        	a[r]=temp;
        	l++;
        	r--;
        }
        
        for(int d:a)
        System.out.println(d);
     }
}
