package ElectronicDevice.Factory.DesignPattern_07;

public class HpLaptop implements IElectronicDevice {

	@Override
	public void harddiskdevice() {
		
		System.out.println("Hp Laptop Functionailty Details");
		
		System.out.println("********************************");
		
		
		System.out.println("Harddisk Details : 700 GB Harddisk");
	}

	@Override
	public void ram() {
		
		System.out.println("Ram Details : 5 GB Ram");
	}

	@Override
	public void os() {
		
		System.out.println("OS Details : Windows 8.0 OperatingSystem");
	}

	@Override
	public void display() {
		
		System.out.println("Display Details : HD Display");
	}

	@Override
	public void rom() {
		
		System.out.println("Rom Details : Intelcore i6 Processor");
	}

	@Override
	public void screensize() {
		
		System.out.println("ScreenSize Details : 14 inch");
	}

	@Override
	public void companybrand() {
		
		System.out.println("Company Details : Hp n series");
	}

	@Override
	public void warranty() {
		
		System.out.println("WarrantyCard Details : 1 Years warranty");		
	}

}
