package raj;
import java.util.*;

public class Area_and_cirumference_of_cirlce {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14;
		double radius;
		double cirumference, area;
		
		System.out.println("enter radius of cirlce");
		radius = scanner.nextDouble();
		System.out.println("circumference of cirle is "+(2*pi*radius));
		System.out.println("area of cirle is "+(pi*(radius*radius)));
		
	}

}
