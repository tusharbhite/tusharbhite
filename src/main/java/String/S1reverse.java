package String;

public class S1reverse {
public static void main(String[] args) {
	char [] S = {'e','r','h','e','d'};
	reverseString(S);
}

public static void reverseString(char[] s) {
    char temp;
    int n=s.length-1;
    for(int i=0;i<s.length/2;i++)
    {
        temp=s[i];
        s[i]=s[n-i];
        s[n-i]=temp;
    }
   
    
}}