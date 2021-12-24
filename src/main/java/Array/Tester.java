package Array;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Tester {
	public static void main(String s[]) {
		
		String line="HELLO WORLD !!!";



		try {



		URL u=new URL("https://api-mobilespecs.azharimm.site/v2/brands"); 
		HttpURLConnection hr=(HttpURLConnection)u.openConnection();



		System.out.println(hr.getResponseMessage());



		InputStream im=hr.getInputStream(); 
		StringBuffer sb=new StringBuffer();



		BufferedReader br=new BufferedReader(new InputStreamReader(im));



		line=br.readLine();


		while(line!=null)

		{


		System.out.println(line); 
		line=br.readLine();

		}}

		catch (Exception e)

		{

		System.out.println("Exception Occured");


		System.out.println(e);
		}
		
		}
}