import java.util.Scanner;

public class Phillendrom_1st  {
	public static void phil() {

		int userval;
	
		int reminder;
		int newval=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		userval= sc.nextInt();
		int comp = userval;
		while(userval>0) {
		reminder = userval%10;
		userval =userval/10;
		newval= (newval*10)+reminder;
		}
		if(comp == newval) {
		System.out.println("It is a phillendrom number");
		}
		else {
			System.out.println("It is not a phillendrom number");
		}
	}
}
