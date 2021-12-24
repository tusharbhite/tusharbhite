package Array;

public class A8rotate {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5};
	
	//Approach:1
//	int i = 0,n=arr.length, j = n-1; // i and j pointing to first and last element respectively
//    while(i != j){
//    	arr[i]+=arr[j]-(arr[j]=arr[i]);
//    i++;
//  }
	
	//Approach:2
	int n=arr.length,temp=arr[n-1];
    for(int i=n-1;i>0;i--)
    {
        arr[i]=arr[i-1];
    }
    arr[0]=temp;
	
    for(int k:arr)
    System.out.println(k);
	
}

}
