package raj;
import java.util.*;

public class Area_of_rectange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length,breadth;
		System.out.println("enter the lenght of the rectangle");
		length = scanner.nextInt();
		System.out.println("enter the breadth of the rectangle");
		breadth = scanner.nextInt();
		System.out.println("Area of rectangel is "+(length*breadth));
		System.out.println("Paramenter of the rectangle is "+(2*(length+breadth)));
	}

}
