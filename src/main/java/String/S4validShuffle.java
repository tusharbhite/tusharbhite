package String;

import java.util.Arrays;

public class S4validShuffle {
public static void main(String[] args) {
	
	 	String first = "YX";
	    String second = "21";
	    String[] results = {"1XY2", "Y1X2", "Y21XX"};
	    checkVAlidShuffle(first, second, "1XY2");
	
}

static String sortString(String s)
{
	char [] a=s.toCharArray();
	Arrays.sort(a);
	
	
	return String.valueOf(a);}

static void checkVAlidShuffle(String first,String second,String parent)
{
	if(first.length()+second.length()!=parent.length())
		System.out.println(parent +" is not a valid shuffle of "+first+""+second); 
	first=sortString(first);
	second=sortString(second);
	parent=sortString(parent);
	
	 // variables to track each character of 3 strings
    int i = 0, j = 0, k = 0;

    // iterate through all characters of result
    while (k != parent.length()) {

      // check if first character of result matches
      // with first character of first string
      if (i < first.length() && first.charAt(i) == parent.charAt(k))
        i++;

      // check if first character of result matches
      // with the first character of second string
      else if (j < second.length() && second.charAt(j) == parent.charAt(k))
        j++;

      // if the character doesn't match
      else {
System.out.println("MISMATCHED");      }

      // access next character of result
      k++;
    }

    // after accessing all characters of result
    // if either first or second has some characters left
    if(i < first.length() || j < second.length()) {
    	System.out.println("MISMATCHED");   
    }
	System.out.println(parent +" is  a valid shuffle of "+first+" & "+second); 


	
}
	
}
