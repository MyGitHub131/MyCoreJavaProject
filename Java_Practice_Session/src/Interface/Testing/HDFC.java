package Interface.Testing;

public class HDFC implements IBank{

	@Override
	public void deposit() {
		
		System.out.println("I have allready deposited cash in my account");
	}

	@Override
	public void withdraw() {
		
		System.out.println("I have allready withdrawed money from my account");
	}

	@Override
	public void calculateInterest() {
		System.out.println("HDFC BANK DETAILS");
		System.out.println("*****************");
		System.out.println("Calculate interest is 7%");
	}
	
}
