package Fan.Factory.DesignPattern_02;

public class FanFactoryTesting {
	public static void main(String[] args) {
		IFan obj = FanFactory.getInstance("ceiling");
			obj.switchOn();
	}

}
