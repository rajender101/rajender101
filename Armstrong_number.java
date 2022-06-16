package class_4;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		
		int number = scanner.nextInt();
		int input_num=number;
		int sum =0;
		int r;
		
		do {
			r =number%10;
			sum =sum+(r*r*r);
			number = number/10;
			
		}while(number>0);
		
		if(sum==input_num) {
			System.out.println("it is armstrong");
		}
		else {System.out.println( "not armstrong");}
	}

}
