package Fan.Factory.DesignPattern_02;

import javax.print.attribute.standard.RequestingUserName;

public class FanFactory {
	public static IFan getInstance (String str)
	{
		if(str.equals("CeilingFan")) 
			return new CeilingFan();
		else if (str.equals("TableFan"))
			return new TableFan();
		else
			return new StandFan();
	}
}
