import java.util.Scanner;

public class User_input_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User_input_main obj1 = new User_input_main();
		obj1.user_age_validation();
	}
	
	//function to check user age
	public void user_age_validation() 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age<18)
		{
			try
			{
			throw new AgeException("invalid age");
			}
			catch(Exception s)
			{
				System.out.println("invalid age enter the correct age");
			}
		}
		else System.out.println("correct age");
	}

}
