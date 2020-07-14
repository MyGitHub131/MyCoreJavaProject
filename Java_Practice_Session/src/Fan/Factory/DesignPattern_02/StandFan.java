package Fan.Factory.DesignPattern_02;

public class StandFan implements IFan {

	@Override
	public void switchOn() {
		System.out.println("StandFan Is Moving...");
		
	}

	@Override
	public void switchOff() {
		System.out.println("StandFan Is Not Moving...");
		
	}
}
