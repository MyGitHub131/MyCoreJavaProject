package Car.Factory.DesignPattern_04;

public class CarFactory {
	public static ICar orderCar(String str)
	{
		if(str.equals("Alto"))
		{
			return new AltoCar();
		}
		else if (str.equals("Swift")) 
		{
			return new SwiftCar();
		}
		else {
			return new AltoCar();
		}
	}

}
