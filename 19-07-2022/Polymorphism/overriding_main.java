import java.util.Scanner;

public class overriding_main extends overriding_nonmain{

	public static void main(String[] args) {
		overriding_nonmain obj1 = new overriding_main();
		obj1.simInt();

	}
	
	public static void simINt() {
		
		System.out.println("enter principal amount");
		principle = sc.nextDouble();
		System.out.println("enter interest");
		interest = sc.nextDouble();
		System.out.println("enter time");
		time = sc.nextDouble();
		sim_int = (principle*interest*time)/100;
		System.out.println("the simple interest of current account is "+sim_int);

	}

}
