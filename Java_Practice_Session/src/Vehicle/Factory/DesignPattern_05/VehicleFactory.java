package Vehicle.Factory.DesignPattern_05;

public class VehicleFactory {
	public static IVehicle orderCar(String str)
	{
		if(str.equals("Alto"))
		{
			return new AltoCar();
		}
		else if (str.equals("Swift"))
		{
			return new SwiftCar();
		}
		else if (str.equals("Wagnor")) {
			return new WagnorCar();
		}
		else if (str.equals("Fortune")) 
		{
			return new FortunarCar();
		}
		else {
			return new AltoCar();
		}
	}
}
