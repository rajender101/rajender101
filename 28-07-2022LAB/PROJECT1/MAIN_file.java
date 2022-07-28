import java.util.Scanner;

public class MAIN_file  {

	public static void main(String[] args) throws User_exception, Invalid_password {
		
		MAIN_file obj1 = new MAIN_file();
		obj1.take_user_id();
		
		
	}
	String user_id_input;
	String password_input;
	Boolean valcheck = true;
	Scanner sc = new Scanner(System.in);
	public static final int PASSWORD_LENGTH = 8;
	
	public void take_user_id() throws User_exception {
		
		
		
		
		
			System.out.println("enter user id");
			user_id_input = sc.next();
			if(user_id_input.length()<8)
			{
			throw new User_exception("invalid userid");
			}
			
		
	}
	
	public void take_password() throws Invalid_password
	{
		 Scanner input = new Scanner(System.in);
	        System.out.print(
	                "1. A password must have at least eight characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n" +
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
	        String s = input.nextLine();

	        if (is_Valid_Password(s)) {
	            System.out.println("Password is valid: " + s);
	            throw new Invalid_password("invalid password");
	        } else {
	            System.out.println("Not a valid password: " + s);
	        }

	    }

	    public static boolean is_Valid_Password(String password) {

	        if (password.length() < PASSWORD_LENGTH) return false;

	        int charCount = 0;
	        int numCount = 0;
	        for (int i = 0; i < password.length(); i++) {

	            char ch = password.charAt(i);

	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }


	        return (charCount >= 2 && numCount >= 2);
	    }

	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    }

	}
	


