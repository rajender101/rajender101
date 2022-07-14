import java.util.Scanner;

public class Pyramid_patter {

	public static void main(String[] args) {
		Pyramid_patter  obj = new Pyramid_patter(); 
		obj.pattern();

	}
	Scanner sc = new Scanner(System.in);
	int userval;
	int i,j,k;
	public void pattern() {
		System.out.println("enter a value");
		userval = sc.nextInt();
		for(i =1;i<=userval;i++)
		{
			for(k =userval;k>i;k--) {
				System.out.print(" ");
			}
			for(j =1;j<(2*i);j++)
				{
				System.out.print("*");
				}
			System.out.println();
		}
		
		
	}

}
