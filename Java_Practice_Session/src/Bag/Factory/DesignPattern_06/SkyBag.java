package Bag.Factory.DesignPattern_06;

public class SkyBag implements ITravelBag {

	@Override
	public void carry() {
		System.out.println("SkyBag Functional Details...");
		
		System.out.println("***********************************************************************************");
		
		System.out.println("SkyBag Carrying...");
	}

	@Override
	public void move() {
		
		System.out.println("SkyBag Moving...");
	}
}
