package Bag.Factory.DesignPattern_06;

public class VipBag implements ITravelBag {

	@Override
	public void carry() {
		System.out.println("VipBag Functional Details...");
		
		System.out.println("***********************************************************************************");
		
		
		System.out.println("VipBag Carrying...");
	}

	@Override
	public void move() {
		
		System.out.println("VipBag Moving...");
	}
}
