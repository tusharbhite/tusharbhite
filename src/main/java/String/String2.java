package String;
//Palindrome
public class String2 {
public static void main(Strings[] args) {
	
	String str="NITIN";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str.equals(rev))
			System.out.println(rev+" is Palindrome");
	else
		System.out.println(rev+" is  not Palindrome");
	
}
	
}
