
public class Chained_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chained_Exception obj1= new Chained_Exception();
		try {
			obj1.runexception();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void runexception() throws Exception_class
	{
		try
		{
			method1();
		}
		catch(Exception e)
		{
			throw new Exception_class("calling from runexception");
		}
	}
	public void method1() throws Exception_class
	{
		try {
			method2();
		}
		catch(Exception e)
		{
			throw new Exception_class("calling from method1");
		}
	}
	public void method2() throws Exception
	{
		try 
		{
			method3();
		}
		catch(Exception e) 
		{
			throw new Exception("calling from method2");
		}
	}
	public void method3() throws Exception
	{
		throw new Exception("calling from method3");
	}	
	

}
