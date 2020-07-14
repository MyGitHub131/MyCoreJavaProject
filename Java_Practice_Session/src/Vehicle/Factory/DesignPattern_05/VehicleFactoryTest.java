package Vehicle.Factory.DesignPattern_05;

public class VehicleFactoryTest {
	public static void main(String[] args) {
		IVehicle v = VehicleFactory.orderCar("Swift");
			v.assembly();
			v.engine();
			v.fuel();
			v.color();
	}

}
