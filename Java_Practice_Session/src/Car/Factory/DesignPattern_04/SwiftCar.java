package Car.Factory.DesignPattern_04;

public class SwiftCar implements ICar{

	@Override
	public void engine() {
		
		System.out.println("Swift Car Engine Is Starting...");
	}

	@Override
	public void fuel() {
		
		System.out.println("Fuel Is Loading...");
	}

	@Override
	public void color() {
		
		System.out.println("Blue Color Car...");
		System.out.println("Assembly the swift car enginee...");
	}

}
