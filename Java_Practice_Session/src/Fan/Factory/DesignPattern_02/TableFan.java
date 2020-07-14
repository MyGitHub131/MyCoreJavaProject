package Fan.Factory.DesignPattern_02;

public class TableFan implements IFan {

	@Override
	public void switchOn() {
		System.out.println("TableFan Is Moving...");
		
	}

	@Override
	public void switchOff() {
		System.out.println("TableFan Is Not Moving...");
		
	}
}
