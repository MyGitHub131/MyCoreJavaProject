package Car.Factory.DesignPattern_04;

public class CarFactoryTest {
	public static void main(String[] args) {
		ICar object = CarFactory.orderCar("Alto");
			object.color();
			object.engine();
			object.fuel();
	}

}
