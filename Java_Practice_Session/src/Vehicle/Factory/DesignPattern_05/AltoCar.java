package Vehicle.Factory.DesignPattern_05;

public class AltoCar implements IVehicle {

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
		
		System.out.println("Red Color");
	}

	@Override
	public void assembly() {
		System.out.println("Alto Car Functionailty Details :");
		System.out.println("**********************************************************");
		System.out.println("Wheel attaching");
		System.out.println("Seat fitting");
		System.out.println("Glass arranging");
		System.out.println("Seat Belt setting");
	}

}
