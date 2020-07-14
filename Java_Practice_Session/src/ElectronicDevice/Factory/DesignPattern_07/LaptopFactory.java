package ElectronicDevice.Factory.DesignPattern_07;

public class LaptopFactory {
	public static IElectronicDevice orderLaptop(String type)
	{
		if (type.equals("Dell")) {
			return new DellLaptop();
		}
		else if (type.equals("Hp")) {
			return new HpLaptop();
		}
		else if (type.equals("Lenovo")) {
			return new LenovoLaptop();
		}
		else if (type.equals("Samsang")) {
			return new SamsangLaptop();
		}
		else {
			return new DellLaptop();
		}
		
	}

}
