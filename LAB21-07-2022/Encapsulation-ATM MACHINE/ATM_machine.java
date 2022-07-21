import java.util.Scanner;

public class ATM_machine {
	Scanner sc = new Scanner(System.in);
	double withdraw_amount;
	double user_value;
	int user_pin;
	
	
	

	public static void main(String[] args) {
		
		ATM_machine obj2 = new ATM_machine();
		
		obj2.deposite();
		
	}
		public void withdraw()
		{	
			if(matching_pin()==true)
			{
				System.out.println("Enter the amount you want to withdraw");
				withdraw_amount = sc.nextDouble();
				User_info obj1 = new User_info();
				
				
				user_value = obj1.get_amount();
				if(user_value>withdraw_amount) 
				{
					obj1.set_amount(user_value-withdraw_amount);
					System.out.println("your balance is"+obj1.get_amount());
				}
				else 
				{
					System.out.println("You do not have enough balance");
				}
			}
			else 
			{
				System.out.println("incorrect pin");
			}
			
		}
			public boolean matching_pin()
			{
				System.out.println("enter your pin");
				user_pin = sc.nextInt();
				User_info obj2 = new User_info();
				if(user_pin==obj2.get_pin_number())
				{
					return true;
				}
				else {
					return false;
				}
			
			}
			public void deposite() {
				System.out.println("enter the amount you want to deposite");
				double new_amount = sc.nextDouble();
				User_info obj3 = new User_info();
				obj3.set_amount(new_amount+obj3.get_amount());
				System.out.println(obj3.get_amount());
			}
	
	}
	
