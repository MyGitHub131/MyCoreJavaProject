package Vehicle.Factory.DesignPattern_05;

public class WagnorCar implements IVehicle{

	@Override
	public void engine() {
		
		System.out.println("Engine Starting");
	}

	@Override
	public void fuel() {
		
		System.out.println("Fuel Loading");
	}

	@Override
	public void color() {
		
		System.out.println("White Color");
	}

	@Override
	public void assembly() {
		System.out.println("Wagnor Car Functionailty Details :");
		System.out.println("**********************************************************");
		System.out.println("Wheel Attaching");
		System.out.println("Seat Fitting");
		System.out.println("Glass Arranging");
	}

}
