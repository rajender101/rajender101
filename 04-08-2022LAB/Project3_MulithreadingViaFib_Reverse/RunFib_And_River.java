
public class RunFib_And_River {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object and running Thread from ThreadFibonacciSeries class
		ThreadFibonacciSeries obj1 = new ThreadFibonacciSeries(10);
		obj1.start();
		//creating object and running Thread from ThreadRiverseOrder
		ThreadRiverseOrder obj2 = new ThreadRiverseOrder(124);
		obj2.start();
	}
	

}
