import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAcceptInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAcceptInfo obj1= new ArrayListAcceptInfo();
		obj1.ArrList();
	}
	
	public void ArrList()
	{	int count =0;
		
		System.out.print("press 1 to create an arraylist");
		Scanner sc= new Scanner(System.in);
		int userChoice= sc.nextInt();
		ArrayList<String> storeAll = new ArrayList<>();
		//create list and store value according to the user
		while(userChoice==1)
		{
			count= count+1;
			String arrayObj= "al"+count;
			storeAll.add(arrayObj);
			ArrayList<String> arrayObj1 = new ArrayList<>();
			System.out.println("Enter name ");
			arrayObj1.add(sc.next());
			System.out.println("Enter email ");
			arrayObj1.add(sc.next());
			System.out.println("Enter Phone ");
			arrayObj1.add(String.valueOf(sc.nextLong()));
			System.out.println("Enter percentage ");
			arrayObj1.add(String.valueOf(sc.nextFloat()));
			System.out.println(arrayObj1);
			System.out.println("if you want to continue press 1 and if you to exit press 0");
			userChoice=sc.nextInt();
			if(userChoice==1) {
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.println(storeAll);
		
		//find the username
		System.out.println("enter the user name you want to delete the file for");
		String delName = sc.next();
		for(int i=0;i<storeAll.size();i++)
		{
			if(storeAll.get(i).contains(delName)) {
				String delList= storeAll.get(i);
				Object Object = "al" +delList+".clearAll()";
				System.out.println("hurray");
			}
			else
			{
				System.out.println("name not found");
			}
		}
		
	}
}
