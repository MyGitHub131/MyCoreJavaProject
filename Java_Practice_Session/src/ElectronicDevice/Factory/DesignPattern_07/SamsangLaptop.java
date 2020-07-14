package ElectronicDevice.Factory.DesignPattern_07;

public class SamsangLaptop implements IElectronicDevice {

	@Override
	public void harddiskdevice() {
		
		System.out.println("Samsang Laptop Functionailty Details");
		
		System.out.println("************************************");
		
		
		System.out.println("Harddisk Details : 620 GB Harddisk");
	}

	@Override
	public void ram() {
		
		System.out.println("Rom Details : 5 GB Ram");
	}

	@Override
	public void os() {
		
		System.out.println("OS Details : Windows 10.0 OpeartingSystem");
	}

	@Override
	public void display() {
		
		System.out.println("Display Details : HD Display");
	}

	@Override
	public void rom() {
		
		System.out.println("Rom Details : Intelcore n series Processor");
	}

	@Override
	public void screensize() {
		
		System.out.println("ScreenSize Details : 14 inch");
	}

	@Override
	public void companybrand() {
		
		System.out.println("Company Details : Samsang n series");
	}

	@Override
	public void warranty() {
		System.out.println("WarrantyCard Details : 2 Years warranty");
	}

}
