package Bag.Factory.DesignPattern_06;

public class SafariBag implements ITravelBag {

	@Override
	public void carry() {
		System.out.println("SafariBag Functional Details...");
		
		System.out.println("***********************************************************************************");
		
		
		System.out.println("SafariBag Carrying...");
	}

	@Override
	public void move() {
		
		System.out.println("SafariBag Moving...");
	}
}
