package raj;
import java.util.*;

public class Find_a_vowel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char vowel;
		System.out.println("enter a vowel");
		vowel= scanner.next().charAt(0);
		switch(vowel)
		{
		case 'a':System.out.println("it is a vowel 'a' ");
		break;
		case 'e': System.out.println("it is a vowel 'e' ");
		break;
		case 'i': System.out.println("it is a vowel 'i' ");
		break;
		case 'o': System.out.println("it is a vowel 'o' ");
		break;
		case 'u': System.out.println("it is a vowel 'u' ");
		break;
		default: System.out.println("not a vowel");
		
		}

	}

}
