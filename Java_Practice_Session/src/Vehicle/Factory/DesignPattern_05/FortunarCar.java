package Vehicle.Factory.DesignPattern_05;

public class FortunarCar implements IVehicle {

	@Override
	public void engine() {
		
		System.out.println("Enginee Starting");
	}

	@Override
	public void fuel() {
		
		System.out.println("Fuel Loading");
	}

	@Override
	public void color() {
		
		System.out.println("Brown Color");
	}

	@Override
	public void assembly() {
		System.out.println("Fortunar Car Functionailty Details :");
		System.out.println("**********************************************************");
		System.out.println("Wheel Attaching");
		System.out.println("Seat Fitting");
		System.out.println("Horn Arranging");
	}	

}
