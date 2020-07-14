package Interface.Testing;

public class BankTesting {
	public static void main(String[] args) {
		//IBank c = new ICICI();
		IBank c = BankFactory.calledBank("Hdfc");
			c.calculateInterest();
			c.deposit();
			c.withdraw();
	}

}
