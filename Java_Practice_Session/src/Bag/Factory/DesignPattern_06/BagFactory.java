package Bag.Factory.DesignPattern_06;

public class BagFactory {
	public static ITravelBag orderBag(String type)
	{
		if (type.equals("Sky")) {
			return new SkyBag();
		}
		else if (type.equals("Safar")) {
			return new SafariBag();
		}
		else if (type.equals("American")) {
			return new AmericanTuristorBag();
		}
		else if (type.equals("Vip")) {
			return new VipBag();
		}
		return new SafariBag();
	}

}
