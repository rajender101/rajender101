import java.util.Scanner;

public class fibonnaci_1 extends Phillendrom_1st  {
public static void fib() {

	int new_num =1;
	int i =1;
	int prev_num = 0; 
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the length");
	int length = sc.nextInt();
	while(i<=length) {
		new_num = prev_num + new_num;
		prev_num = new_num;
		i++;
		
	}
	System.out.println(new_num);

}
}
