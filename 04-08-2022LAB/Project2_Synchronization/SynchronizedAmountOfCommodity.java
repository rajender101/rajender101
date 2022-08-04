import java.util.Scanner;

public class SynchronizedAmountOfCommodity extends Thread {
	int commodity =100;
	Scanner sc= new Scanner(System.in);
	public void run()
	{	
		synchronized(this){
			int user_input;
			System.out.println("press 1 if you want to add and 2 if you want to subtract");
			user_input = sc.nextInt();
			if(user_input==1)
			{
				add();
			}
			else if(user_input==2)
			{
				subtract();
			}
			else
			{
				System.out.println("invalid answer try again");
			}
			
		}
	}
	//method to add commodity
	private int add()
	{ 
		int num;
		System.out.println("enter the quantity");
		num= sc.nextInt();
		commodity =num+commodity;
		System.out.println("commodity left: "+commodity);
		return commodity;
	}
	//method to subtract commodity
	private int subtract()
	{
		int num;
		System.out.println("enter the quantity");
		num= sc.nextInt();
		if(commodity>num)
		{
		commodity =commodity-num;
		System.out.println("commodity left: "+commodity);
		}
		else
		{
			System.out.println("only "+commodity+" left");
		}
		return commodity;
	}

}
