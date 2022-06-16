package raj;
import java.util.*;

public class Find_a_cube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int u_input;
		
		System.out.println("enter a number");
		u_input = scanner.nextInt(); 
		
		if((u_input % 2)==0)
		{
			
			System.out.println("cube is "+ u_input*u_input*u_input);
		}
		else {
			System.out.println("noteven");
		}
	}

}
