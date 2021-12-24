package String;

public class S2palindrome {
	public static void main(String[] args) {
		char [] S = {'e','r','h','e','d'};
		String s=S.toString();
		isPalindrome(s);
	}



static int isPalindrome(String S) {
    // code here
    
    char temp;
int p= S.length()-1;
for(int i=0;i<S.length()/2;i++)
{
    if(S.charAt(i)!=S.charAt(p-i))
    return 0;
}
return 1;
}}