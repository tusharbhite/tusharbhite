package leetcode;

public class shuffle {
public static void main(String[] args) {
	int [] arr= {4,5,6,7,0,1,2,3};
	System.out.println(restoreString("codeleet", arr));

}


static public String restoreString(String s, int[] indices) {
    for(int i=0;i<s.length();i++)
    {
    	char sc=s.charAt(indices[i]);
        s.charAt(i)=sc;
    }
    return s;
}}
