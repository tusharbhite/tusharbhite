package String;
/*Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1? 
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)*/
public class String3 {
	
	 static void isRotation(String s1,String s2)
	{
		 if((s1.length()==s2.length()) && (s1+s1).indexOf(s2)!=-1 )
			 System.out.println(s1+ " is Rotation  of "+s2);
		 else 
			 System.out.println(s1+ " is NOT a Rotation  of "+s2);
	}

	public static void main(Strings[] args) {
		 String str1 = "AACD";
	        String str2 = "ACDA";
	        String str3="DCAA";
	        
	        isRotation(str1,str2);
	        isRotation(str2, str3);
	        
	        		
	 
	}
}
