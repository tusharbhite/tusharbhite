package Array;

public class A11duplicate {
public static void main(String[] args) {
	int arr[]= {1,3,4,2,2};
	System.out.println(findDuplicate(arr,arr.length));
}
static int findDuplicate(int arr[],int n) {
	if(n==0)
		return n;
	int i=arr[0],j=arr[0];
	while(true)
	{
		i=arr[i];
		j=arr[arr[j]];
		System.out.println("i="+i+" j="+j);
		if(i==j)
			break;
	}
	i=arr[0];
	while(true)
	{
		if(i==j)
		return i;
		i=arr[i];
		j=arr[j];
	}
}
}
