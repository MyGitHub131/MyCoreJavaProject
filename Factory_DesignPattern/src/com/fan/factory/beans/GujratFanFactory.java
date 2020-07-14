package com.fan.factory.beans;

public class GujratFanFactory {
	public static IElectricFan manufactureFan(String model) {
		IElectricFan iElectricFan = null;

		if (model.equals("bajaj")) {
			iElectricFan = new BajajFan();
		} else if (model.equals("havels")) {
			iElectricFan = new HavelsFan();
		} else if (model.equals("crompton")) {
			iElectricFan = new CromptonFan();
		} else if (model.equals("sec")) {
			iElectricFan = new SecFan();
		} else if (model.equals("usha")) {
			iElectricFan = new UshaFan();
		}
		return iElectricFan;
	}
}
