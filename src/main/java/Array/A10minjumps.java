package Array;

public class A10minjumps {
public static void main(String[] args) {
	int arr[]= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	//op=3
	int n=arr.length;
	System.out.println(minJumps(arr,n));
}
static int minJumps(int[] arr, int n) {

	int jumps=0,temp=0;
	int end=0;
	
	
	for(int i=0;i<n;i++)
	{
		temp=arr[i];
		end=temp+i;
		
		for(int j=i;j<=end;j++)
		{
			if(j>=n)
				break;
			System.out.println(arr[j]);
		}
		jumps++;
		System.out.println("#");
		i=end-1;
		
		
	}
	
	return jumps;
	
}
}
