package AbstractClass.Testing;

public abstract class Bank {
	//Concrete methods
	public void deposit()
	{
		System.out.println("Deposit functionailty common across for all the banks");
	}
	
	public void withdraw()
	{
		System.out.println("Withdraw functionailty common across for all the banks");
	}
	//Abstract methods
	public abstract void calculateInterest();
}
