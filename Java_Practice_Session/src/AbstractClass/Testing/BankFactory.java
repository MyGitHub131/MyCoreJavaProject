package AbstractClass.Testing;

public class BankFactory {
	public static Bank calledBank(String type)
	{
		if (type.equals("Sbi")) {
			return new SBI();
		}
		else if (type.equals("Icici")) {
			return new ICICI();
		}
		else if (type.equals("Hdfc")) {
			return new HDFC();
		}
		else {
			return new SBI();
		}
	}

}
