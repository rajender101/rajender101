package raj;
import java.util.Scanner;

public class Calculate_interest {

	public static void main(String[] args) {
		double principal_amount,interest;
		double roi,no_of_year;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter principal amount");
		principal_amount = scanner.nextDouble();
		System.out.println("enter rate of interest");
		roi = scanner.nextDouble();
		System.out.println("enter number of years");
		no_of_year = scanner.nextDouble();
		interest = (principal_amount * roi * no_of_year)/100;
		System.out.println("interest is "+interest);
		

	}

}
