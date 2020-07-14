package Interface.Testing;

public class SBI implements IBank{

	@Override
	public void deposit() {
		
		System.out.println("I have allready deposited cash in my account");
	}

	@Override
	public void withdraw() {
		
		System.out.println("I have allready withdraw money from my account");
	}

	@Override
	public void calculateInterest() {
		System.out.println("SBI BANK DETAILS");
		System.out.println("****************");
		System.out.println("Calculate interest is 4%");
	}
	
}
