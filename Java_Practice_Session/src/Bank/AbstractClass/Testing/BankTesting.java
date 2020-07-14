package Bank.AbstractClass.Testing;

public class BankTesting {
	public static void main(String[] args) {
		//Bank b = new ICICI();
				Bank b = BankFactory.calledBank("Axis");
					b.calculateInterest();
					b.deposit();
					b.withdraw();
	}

}
