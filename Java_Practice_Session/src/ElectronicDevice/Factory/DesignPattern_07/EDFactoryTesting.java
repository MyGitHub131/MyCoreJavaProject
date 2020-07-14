package ElectronicDevice.Factory.DesignPattern_07;

public class EDFactoryTesting {
	public static void main(String[] args) {
		//IElectronicDevice ed = new HpLaptop();
		IElectronicDevice ed = LaptopFactory.orderLaptop("Lenovo");
			ed.harddiskdevice();
			ed.companybrand();
			ed.display();
			ed.ram();
			ed.rom();
			ed.os();
			ed.screensize();
			ed.warranty();
	}
}
