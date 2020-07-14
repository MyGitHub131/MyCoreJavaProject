package Singleton;

public class DateUtil {
	//Using Eager initialization singleton class creation
	
	/*private static DateUtil singleton = new DateUtil();
	public String str;
	
	private DateUtil()
	{
		str ="Hi how are u all of u...";
	}
	
	public static DateUtil getInstance()
	{
		return singleton;
	}
*/
	//Using Lazy initialization singleton class creation
	
	/*private static DateUtil singleton = null;
	public String str;
	
	private DateUtil()
	{
		str ="Hi good morning...";
	}
	
	public static DateUtil getInstance()
	{
		if(singleton == null)
		{
			singleton = new DateUtil();
		}
		return singleton;
	}*/
	
	// Using Static block singleton class creation
	
	private static DateUtil singleton = null;
	public String str;
	
	private DateUtil()
	{
		str ="Hi baby";
	}
	static{
		singleton = new DateUtil();
	}
	
	public static DateUtil getInstance()
	{
		return singleton;
	}
}
