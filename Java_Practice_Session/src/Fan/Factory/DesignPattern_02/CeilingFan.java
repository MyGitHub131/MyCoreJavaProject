package Fan.Factory.DesignPattern_02;

public class CeilingFan implements IFan {

	@Override
	public void switchOn() {
		System.out.println("CeilingFan Is Moving...");
		
	}

	@Override
	public void switchOff() {
		System.out.println("CeilingFan Is Not Moving...");
		
	}
}
