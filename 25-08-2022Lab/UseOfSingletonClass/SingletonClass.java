
public class SingletonClass {

	private static SingletonClass singletonobj=null;
	
	SingletonClass()
	{
		
	}
	public static SingletonClass getSingleton()
	{
		if(singletonobj== null)
		{
			singletonobj= new SingletonClass();
		}
		return singletonobj;
	}

}
