import java.util.Scanner;

public class Customer_producer {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object for class and starting user_identification method
		Customer_producer obj1 = new Customer_producer();
		obj1.user_identification();
		Customer_producer obj2 = new Customer_producer();
		obj2.user_identification();
		
	}
	//method to identify if user is a customer or producer
	public void user_identification()
	{	int identity;
		SynchronizedAmountOfCommodity obj1= new SynchronizedAmountOfCommodity();
		System.out.println("if you are a customer press 1 and if you are producer press 2");
		identity = sc.nextInt();
		if(identity==1)
		{
			System.out.println("You are a customer");
			obj1.start();
		}
		else if(identity ==2)
		{
			System.out.println("you are a producer");
			obj1.start();
		}
		else
		{
			System.out.println("invalid identity");
		}
		
	}

}
