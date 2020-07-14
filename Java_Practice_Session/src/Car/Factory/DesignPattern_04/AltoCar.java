package Car.Factory.DesignPattern_04;

public class AltoCar implements ICar {

	@Override
	public void engine() {
		
		System.out.println("Alto Car Engine Is Starting...");
	}

	@Override
	public void fuel() {
		
		System.out.println("Fuel Is Loading...");
	}

	@Override
	public void color() {
		
		System.out.println("Red Color Car...");
		System.out.println("Assembly the alto car enginee...");
	}

}
