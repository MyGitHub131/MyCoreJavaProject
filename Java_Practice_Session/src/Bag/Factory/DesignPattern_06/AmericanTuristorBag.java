package Bag.Factory.DesignPattern_06;

public class AmericanTuristorBag implements ITravelBag {

	@Override
	public void carry() {
		System.out.println("AmericanTuristorBag Functional Details...");
		
		System.out.println("***********************************************************************************");
		
		
		System.out.println("AmericanTuristorBag Carrying...");
	}

	@Override
	public void move() {
		
		System.out.println("AmericanTuristorBag Moving...");
	}
}
