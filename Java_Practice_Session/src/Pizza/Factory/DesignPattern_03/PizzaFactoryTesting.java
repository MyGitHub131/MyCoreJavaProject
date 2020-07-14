package Pizza.Factory.DesignPattern_03;

public class PizzaFactoryTesting {
	public static void main(String[] args) {
		IPizza obj = PizzaFactory.orderPizza("CPizza");
			obj.bake();
			obj.cut();
			obj.prepare();
	}

}
