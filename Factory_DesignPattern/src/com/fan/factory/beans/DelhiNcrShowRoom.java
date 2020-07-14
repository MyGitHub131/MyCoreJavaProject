package com.fan.factory.beans;

public class DelhiNcrShowRoom {
	public static IElectricFan orderFan(String model)
	{
		IElectricFan iElectricFan = null;
		
		iElectricFan = GujratFanFactory.manufactureFan(model);
		
		iElectricFan.SwitchOn();
		iElectricFan.move();
		iElectricFan.SwitchOff();
		
		return iElectricFan;
	}
}
