package Vehicle.Factory.DesignPattern_05;

public class SwiftCar implements IVehicle{

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
		
		System.out.println("Blue Color");
	}

	@Override
	public void assembly() {
		System.out.println("Swift Car Functionailty Details :");
		System.out.println("**********************************************************");
		System.out.println("Wheel Attaching");
		System.out.println("Seat Fitting");
	}
	
}
