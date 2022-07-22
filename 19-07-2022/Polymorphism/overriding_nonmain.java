import java.util.Scanner;

public class overriding_nonmain {
	static Scanner sc = new Scanner(System.in);
	static double principle, interest,time, sim_int;
	

	public static void simInt() {
		System.out.println("enter principal amount");
		principle = sc.nextDouble();
		System.out.println("enter interest");
		interest = sc.nextDouble();
		System.out.println("enter time");
		time = sc.nextDouble();
		sim_int = (principle*interest*time)/100;
		System.out.println("the simple interest of saving account is "+sim_int);

	}
}
