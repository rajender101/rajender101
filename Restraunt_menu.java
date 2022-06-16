package day3;
import java.util.*;

public class Restraunt_menu {

	public static void main(String[] args) {
		int choice = 0;
		boolean rechoice = false ;
		char reorder;
		int starter_price = 0,menu_price =0,dessert_price =0;
		int start_choice1 = 0;
		int starter1=0,starter2=0,starter3=0;
		int menu1=0,menu2=0,menu3=0;
		int dess1=0,dess2=0,dess3=0;

		
		
		int price=0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("enter 1 for starter");
			System.out.println("enter 2 for Menu");
			System.out.println("enter 1 for Dessert");
			choice = scanner.nextInt();
			switch(choice){
			case 1:
				System.out.println("frech fries 10Rs");	
				System.out.println("onion rings 10Rs");
				System.out.println("vegitable fries 10Rs");
				System.out.println("enter 1 or 2 or 3 for your starter");
				start_choice1 = scanner.nextInt();
				switch(start_choice1) {
				case 1: System.out.println("You have choosen 1 frech fires 10rs");
						starter1 +=1;
						starter_price =starter_price +10;
						System.out.println("Starter= "+starter1+" and price "+starter_price);
						break;
						case 2:System.out.println("You have choosen 1 onion ring 10rs");
						starter2 +=1;
						starter_price =starter_price +10;
						System.out.println("Starter= "+starter2+" and price "+starter_price);
						break;
						case 3:
						System.out.println("You have choosen 1 Vegitable fries 10rs");
						starter3 +=1;
						starter_price =starter_price +10;
						System.out.println("Starter= "+starter3+" and price "+starter_price);
						break;
						}		
				break;
			case 2:
				System.out.println("Main course1 sahi daal 20Rs ");	
				System.out.println("Main course2 kadi chawal20Rs");
				System.out.println("Main course3 sahi panner 20Rs");
				System.out.println("enter 1 or 2 or 3 for your Menu");
				start_choice1 = scanner.nextInt();
				switch(start_choice1) {
				case 1:
					System.out.println("You have choosen sahi daal of 20Rs");
					menu_price =menu_price +20;
					menu1 +=1;
					System.out.println("Menu = "+ menu1+" and price "+menu_price);
					break;
				case 2:
					System.out.println("You have choosen kadi chawal of 20Rs");
					menu_price =menu_price +20;
					menu2 +=1;
					System.out.println("Menu = "+ menu2+" and price "+menu_price);
					break;
				case 3:
					System.out.println("You have choosen sahi paneer of 20Rs");
					menu_price =menu_price +20;
					menu3 +=1;
					System.out.println("Menu = "+ menu3+" and price "+menu_price);
					break;
				}			
				
				break;
				
			case 3:
				System.out.println("Dessert1 ice cream 30Rs");	
				System.out.println("Dessert2 halwa 30Rs");
				System.out.println("Dessert3 cake 30Rs");
				System.out.println("enter 1 or 2 or 3 for your Menu Dessert");
				start_choice1 = scanner.nextInt();
				switch(start_choice1) {
				case 1:
					System.out.println("You have choosen 1 ice cream of 30rs ");
					dessert_price =dessert_price +30;
					dess1+=1;
					System.out.println("Dessert = "+ dess1+" and price "+dessert_price);
						break;
				case 2:
					System.out.println("You have choosen 1 halwa of 30rs ");
					dessert_price =dessert_price +30;
					dess2+=1;
					System.out.println("Dessert = "+ dess2+" and price "+dessert_price);
						break;
				case 3:
					System.out.println("You have choosen 1 cake of 30rs ");
					dessert_price =dessert_price +30;
					dess3+=1;
					System.out.println("Dessert = "+ dess3+" and price "+dessert_price);
						break;			
				}
			}
			System.out.println("Press 'Y' if you want to order again and 'n' if you want to exit");
			reorder = scanner.next().charAt(0);
			if(reorder=='y') {
				rechoice= true;
			}
			else {
				System.out.println("total price is"+(dessert_price+menu_price+starter_price));
				rechoice = false;
			}
			
		}
		while(rechoice == true);

	}

}
