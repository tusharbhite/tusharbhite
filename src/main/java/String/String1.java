package String;
//String Reverse

public class String1 {
	public static void main(Strings[] args) {
		
		String str="HELLO";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
