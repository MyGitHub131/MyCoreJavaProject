package Bank.AbstractClass.Testing;

public abstract class Bank {
	public void deposit()
	{
		System.out.println("Deposit function working");
	}
	public void withdraw()
	{
		System.out.println("Wrthdraw function working");
	}
	public abstract void calculateInterest();
}
