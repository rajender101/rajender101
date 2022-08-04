
public class ThreadFibonacciSeries extends Thread{
	int length;
	int pos1=0;
	int pos2=1;
	int sum=0;
	public ThreadFibonacciSeries(int value) {
		this.length= value;
	}
	public void run() {
		
		while(length>0) {
		
			sum = pos1+pos2;
			System.out.println(sum);
			pos1 = pos2;
			pos2=sum;
			length--;
		}
	}
}
