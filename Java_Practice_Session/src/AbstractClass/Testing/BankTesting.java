package AbstractClass.Testing;

public class BankTesting {
	public static void main(String[] args) {
		//Bank c = new SBI();
		Bank c = BankFactory.calledBank("Icici");
			c.calculateInterest();
			c.deposit();
			c.withdraw();
	}
}
