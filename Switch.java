package raj;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		int choice ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division");
		choice = scanner.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("do the addition");
			break;
		case 2: System.out.println("do the multiplication");
			break;
		case 3: System.out.println("do the subtraction");
			break;
		case 4: System.out.println("do the division");
			break;
		default:System.out.println("incorrect option please try again");
		
		
		}
	}

}
