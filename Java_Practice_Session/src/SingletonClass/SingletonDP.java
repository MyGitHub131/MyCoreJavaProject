package SingletonClass;

public class SingletonDP {
	private static SingletonDP singleton_instance = null;
	public String str;
	
	private SingletonDP()
	{
		str ="Hey I am using here singleton design pattern...";
	}
	
	public static SingletonDP getInstance()
	{
		if(singleton_instance == null)
		{
			singleton_instance = new SingletonDP(); 
		}
		return singleton_instance;
	}
	
}
