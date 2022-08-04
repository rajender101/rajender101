import java.util.Scanner;

public class ThreadClass extends Thread {
	Scanner sc = new Scanner(System.in);
	String input;
	
	//Constructor of class to take input
	public ThreadClass(String hello)
	{
		this.input = hello;
	}
	public void run()
	{	
		
		// showing input continousely
		while(true)
		{
			System.out.println(input);		
		}
	}
	
}
