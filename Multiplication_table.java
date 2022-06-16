package day3;
import java.util.*;

public class Multiplication_table {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		number = scanner.nextInt();
		
		for(int i =1;i<=10;i++) {
			int answer = number*i;
			System.out.println(number+" * "+" " +i+" = "+ + answer);
		}
		

	}

}
