package raj;
import java.util.Scanner;


public class Rajender {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name;
		int math,science,english,social_science,hindi;
		int sum,rollNo;
		float percentage;
		
		
		System.out.println("enter your name");
		name = scanner.nextLine();
		System.out.println("enter your roll number");
		rollNo = scanner.nextInt();
		System.out.println("enter your marks in english");
		english = scanner.nextInt();
		System.out.println("enter your marks in maths");
		math = scanner.nextInt();
		System.out.println("enter your marks in science");
		science = scanner.nextInt();
		System.out.println("enter your marks in social science");
		social_science = scanner.nextInt();
		System.out.println("enter your marks in hindi");
		hindi = scanner.nextInt();
		
		percentage = ((math +science +english+ social_science+hindi)*100)/500;
		System.out.println("Hi your name is "+name+" and your roll number is "+rollNo+" and your percentage is "+percentage);
		
}
}