package ElectronicDevice.Factory.DesignPattern_07;

public class LenovoLaptop implements IElectronicDevice {

	@Override
	public void harddiskdevice() {
		
        System.out.println("Lenovo Laptop Functionailty Details");
		
		System.out.println("***********************************");
		
		
		System.out.println("Harddisk Details : 360 GB Harddisk");
	}

	@Override
	public void ram() {
		
		System.out.println("Ram Details : 7 GB Ram");
	}

	@Override
	public void os() {
		
		System.out.println("OS Details : Windows 7 OperatingSystem");
	}

	@Override
	public void display() {
		
		System.out.println("Display Details : Lcd Display");
	}

	@Override
	public void rom() {
		
		System.out.println("Rom Details : Intelcore i5 Processor");
	}

	@Override
	public void screensize() {
		
		System.out.println("ScreenSize Details : 15 inch");
	}

	@Override
	public void companybrand() {
		
		System.out.println("Company Details : Lenovo n series");
	}

	@Override
	public void warranty() {
		
		System.out.println("WarrantyCard Details : 3 Years warranty");
	}

}
