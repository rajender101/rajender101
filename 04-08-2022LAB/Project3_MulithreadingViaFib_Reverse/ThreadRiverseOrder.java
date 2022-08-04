
public class ThreadRiverseOrder extends Thread {
	int number;
	int r;
	
	int reverseVal=0;
	public ThreadRiverseOrder(int num) {
		this.number = num;
	}
	
	public void run()
	{
		while(number!=0)
		{
			r = number%10;
			reverseVal= (reverseVal*10)+r;
			number= number/10;
		}
		System.out.println(reverseVal);
	}
}
