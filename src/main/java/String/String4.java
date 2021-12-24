package String;

import java.util.Arrays;

/*Check if a string is a valid shuffle of two distinct strings
  1XY2 is a valid shuffle of XY and 12
Y1X2 is a valid shuffle of XY and 12     
Y21XX is not a valid shuffle of XY and 12
 * */
public class String4 {
	static void isValidShuffle(String s1,String s2,String test)
	{
		char arr1[]=(s1+s2).toCharArray();
		Arrays.sort(arr1);
		
		char arr2[]=test.toCharArray();
		Arrays.sort(arr2);
		
		if(String.valueOf(arr1).equals(String.valueOf(arr2)))
			System.out.println("Valid Shuffle");
		else System.out.println("INValid Shuffle");
					
	}
	
public static void main(Strings[] args) {
	
	isValidShuffle("XY", "12", "X1Y2");
	isValidShuffle("XY", "12", "X12Y");
	isValidShuffle("XY", "12", "1X2Y");
	isValidShuffle("XY", "12", "X1Y1");
	isValidShuffle("XY", "12", "X1Y21");

	



}
}
