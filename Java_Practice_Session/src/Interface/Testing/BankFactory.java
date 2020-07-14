package Interface.Testing;

public class BankFactory {
	public static IBank calledBank(String msg)
	{
		if (msg.equals("Sbi")) {
			return new SBI();
		}
		else if (msg.equals("Hdfc")) {
			return new HDFC();
		}
		else if (msg.equals("Icici")) {
			return new ICICI();
		}
		else {
			return new SBI();
		}
	}
}
