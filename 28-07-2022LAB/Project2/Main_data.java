import java.util.Scanner;

public class Main_data {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean value = pass_space();
		System.out.println(value);
		Main_data obj1 = new Main_data();
		obj1.isdigit();
		obj1.checklength();
		obj1.check_special_char();
		obj1.check_lower();
		obj1.check_upper();
		

	}
	static String password;
	
	
	// checking if password has space or not
	
	public static String passfunction()
	{
		System.out.println("enter password");
		String password= sc.next();
		return password;
	}
	public static boolean pass_space()
	{
		String password = passfunction();
		boolean check =true;
		for(int i=0;i<password.length();i++)
		{
			if(password.charAt(i)==' ')
			{
				check = false;
				break;
			}
		}
		return check;
	}
	//function to check if pass has at least one-digit(0-9)
	public void isdigit()
	{
		password= passfunction();
		for(int i = 0;i<password.length();i++)
		{
			if(password.charAt(i)<9||password.charAt(i)>0) {
				System.out.println("correct");
			}
			else
			{
				System.out.println("incorrect");
			}
		}
		
	}
	
	//function to check the length of password
	public void checklength()
	{
		password = passfunction();
		if(password.length()<=15&&password.length()>7)
		{
			System.out.println("length is correct");
		}
		else
		{
		System.out.println("length is not valid");	
		}
	}
	//function to check at least one Lower case
	public void check_lower()
	{	boolean checked_lower= false;
		password = passfunction();
		for(int i=0;i<password.length();i++) 
		{
			boolean check_char = Character.isLowerCase(password.charAt(i));
			if(check_char==true)
			{
				checked_lower= true;
				break;
			}
			
		}
		if(checked_lower==true)
		{
			System.out.println("correct password has at least one lower case");
		}
		else
		{
			System.out.println("invalid password, must contain one lower case");
		}
	}
	//funtion to check at least one Upper case
	public void check_upper()
	{	boolean checked_upper= false;
		password = passfunction();
		for(int i=0;i<password.length();i++) 
		{
			boolean check_char = Character.isUpperCase(password.charAt(i));
			if(check_char==true)
			{
				checked_upper= true;
				break;
			}
			
		}
		if(checked_upper==true)
		{
			System.out.println("correct password has at least one upper case");
		}
		else
		{
			System.out.println("invalid password, must contain one upper case");
		}
	}
	
	//function to check special character
	public void check_special_char() {
		password = passfunction();
		boolean checked_sp_char= false;
		char special_char_array []= new char[]{'@','#','%' ,'&','!','$'};
		for(int i=0;i<password.length();i++)
		{
			for(int j =0;j<special_char_array.length;j++)
			{
				if(special_char_array[j]== password.charAt(i))
				{
					checked_sp_char = true;
					break;
				}
			}
		}
		if(checked_sp_char==true)
		{	
			System.out.println("special correct found password is correct");
		}
		else
		{
			System.out.println("invalid password no special character");
		}
	}
}
