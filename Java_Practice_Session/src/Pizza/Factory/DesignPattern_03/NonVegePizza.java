package Pizza.Factory.DesignPattern_03;

public class NonVegePizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("Pizza being a prepare plz wait some time u will get...");
	}

	@Override
	public void bake() {
		System.out.println("Pizza is ready u can bake it...");
	}

	@Override
	public void cut() {
		System.out.println("Pizza is serve u can cut it...");
		
	}

}
