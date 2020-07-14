package Bag.Factory.DesignPattern_06;

public class BagFactoryTest {
	public static void main(String[] args) {
		ITravelBag tb = BagFactory.orderBag("Vip");
		//ITravelBag tb1 = new SafariBag();
			tb.carry();
			tb.move();
			
			//tb1.carry();
			//tb1.move();
	}
}
