import java.io.*;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String val="abc";
		String newv="";
		demo(val,newv);

		
		
	}
	//funtion for permutation
	public static void demo(String s1,String s2)
	{
		if(s1.length() == 0)
	    {
	        System.out.println(s2);
	    }
	    for(int i=0 ; i<s1.length() ; i++)
	    {
	        char ch = s1.charAt(i);
	        String ls = s1.substring(0,i);
	        String rs = s1.substring(i+1);
	        String rest = ls + rs;
	        demo(rest , s2+ch);
	    }
	}

}
