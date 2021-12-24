package Array;

public class A5movenegative {
public static void main(String[] args) {
	
	int arr[] = {-22,1, -1, 3, -2, 7, -5, 11, 6 };
	
	int i=-1;
	int pivot=0;
	int temp;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]<pivot)
		{
			i++;
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
		}
	}
	
	for(int k:arr)
	{
		System.out.println(k);
	}
	        }
     


}
