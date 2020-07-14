package Bank.AbstractClass.Testing;

public class BankFactory {
	public static Bank calledBank(String s)
	{
		if(s.equals("Sbi"))
		{
			return new SBI();
		}
		else if(s.equals("Ic"))
		{
			return new ICICI();
		}
		else if(s.equals("Hdfc"))
		{
			return new HDFC();
		}
		else if(s.equals("Boi"))
		{
			return new BOI();
		}
		else if(s.equals("Axis"))
		{
			return new AXIS();
		}
		else{
			return new SBI();
		}
	}

}
