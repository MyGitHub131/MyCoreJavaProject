package ElectronicDevice.Factory.DesignPattern_07;

public class DellLaptop implements IElectronicDevice {
	
	@Override
	public void harddiskdevice() {
        System.out.println("Dell Laptop Functionailty Details");
		
		System.out.println("*********************************");

		
		System.out.println("Harddisk Details : 1 TB Harddisk");
	}

	@Override
	public void ram() {
		
		System.out.println("Ram Details : 7 GB Ram");
	}

	@Override
	public void os() {
		
		System.out.println("OS Details : Windows 8.1 OpearitingSystem");
	}

	@Override
	public void display() {
		
		System.out.println("Display Details : Lcd Hd Display");
	}

	@Override
	public void rom() {
		
		System.out.println("Rom Details : Intelcore i7 Processor");
	}

	@Override
	public void screensize() {
		
		System.out.println("ScreenSize Details : 15 inch");
	}

	@Override
	public void companybrand() {
		
		System.out.println("Company Details : Dell n series");
	}

	@Override
	public void warranty() {
		
		System.out.println("WarrantyCard Details : 2 Years warranty");
	}
}
