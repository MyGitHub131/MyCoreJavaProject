package Pizza.Factory.DesignPattern_03;

public class VegePizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("Pizza being a prepare plz wait some time...");
	}

	@Override
	public void bake() {
		System.out.println("Pizza will be bake...");
	}

	@Override
	public void cut() {
		System.out.println("Your pizza is ready u can cut it...");
	}

}
