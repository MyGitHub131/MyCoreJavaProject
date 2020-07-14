package Sriman_Sir_12;

public class SingletonDesignPattern {
	private static SingletonDesignPattern object;
	private SingletonDesignPattern() {
		System.out.println("no code...");
	}
	public static SingletonDesignPattern getobject()
	{
		if(object==null)
		{
		object = new SingletonDesignPattern();
		System.out.println("flying...");
		}
		return object;
	}
	
}
