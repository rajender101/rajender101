package raj;
import java.util.Scanner;

public class Cost_and_selling_price {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cost_price;
		int selling_price;
		System.out.println("enter cost price");
		cost_price = scanner.nextInt();
		System.out.println("enter selling price");
		selling_price = scanner.nextInt();
		if(cost_price > selling_price) {
			System.out.println("You are having loss of amount "+(cost_price-selling_price));
		}
		else if(selling_price>cost_price) {
			System.out.println("You are having profit of amount "+(selling_price-cost_price));
		}
		else {System.out.println("cost price is equal to selling price");}
	}

}
