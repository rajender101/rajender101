
public class PrvStringAreImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrvStringAreImmutable	 ojb1 = new PrvStringAreImmutable();
		ojb1.reverseString();

	}
	public void immutableString()
	{
		String string1 = "myname";
		String string2= "israj";
		//concating string2 into string1
		string1.concat(string2);
		//but ouput will be showing only string1 because strings are immutable
		System.out.println(string1);
		//here we are saving the value of string1 concatinating with string2
		String string3 = string1.concat(string2);
		//showing output of string3
		System.out.println(string3);
	}
	
	public void checkSameChar()
	{
		 String string="hello";
		 String secstring ="hello";
		 StringBuilder secString = new StringBuilder(secstring);
	     StringBuilder str = new StringBuilder(string);
	        
	        
	        
	        for(int j=0;j<secString.length();j++)
	        {
		        for(int i=0;i<str.length();i++)
		        {
		        	char temp= secString.charAt(i);
		        	int count = str.indexOf(Character.toString(temp));
		        	System.out.println(count);
		        }
	        }
	}
	
	// Write a program to swap two strings without using third variable
	public void swapping()
	{
		String a ="apple";
		String b = "orange";
		a= a+b;
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}
	// Write a program to reverse each word of the string
	public void reverseString()
	{
		String word = "hello";
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();
		System.out.println(sb);
	}
	//phalindrom or not
	public void checkPhalindrom()
	{
		String string ="hello";
		StringBuilder str = new StringBuilder(string);
		
		if(str.reverse()==str)
		{
			System.out.println("phillandrom");
		}
		else
		{
			System.out.println("not phillandrom");
		}
	}

}
