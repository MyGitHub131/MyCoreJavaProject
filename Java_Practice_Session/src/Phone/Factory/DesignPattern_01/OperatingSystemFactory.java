package Phone.Factory.DesignPattern_01;

public class OperatingSystemFactory {
	public static InOS getInstance(String str)
	{
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed"))
		    return new Ios();
		else
			return new Windows();
	}

}
