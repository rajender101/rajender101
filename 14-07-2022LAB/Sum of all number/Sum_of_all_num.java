import java.util.Scanner;

public class Sum_of_all_num {

	public static void main(String[] args) {
		
		Sum_of_all_num obj =new Sum_of_all_num();
		obj.sum_num();
	}
	
	int userval,reminder;
	int temp=0;
	public void sum_num() {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		
		
		userval= sc.nextInt();
		while(userval>0) {
			
			reminder = userval%10;
			userval= userval / 10;
			temp = temp+reminder;
		}
		System.out.println("sum is "+temp);
		
	}

}
