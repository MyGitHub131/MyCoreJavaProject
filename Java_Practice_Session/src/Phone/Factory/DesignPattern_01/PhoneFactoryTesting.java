package Phone.Factory.DesignPattern_01;

public class PhoneFactoryTesting {
	public static void main(String[] args) {
		InOS obj = OperatingSystemFactory.getInstance("Open");
			obj.spec();
	}

}
