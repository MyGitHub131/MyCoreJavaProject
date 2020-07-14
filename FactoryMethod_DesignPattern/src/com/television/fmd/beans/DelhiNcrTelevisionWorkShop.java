package com.television.fmd.beans;

abstract public class DelhiNcrTelevisionWorkShop {
	public ITelevision orderTelevision(String model) {
		ITelevision iTelevision = null;

		System.out.println("assemble all parts of television...");
		System.out.println("quality checking all television...");
		System.out.println("boxing properly...");

		iTelevision = manufactureTelvision(model);
		iTelevision.SwitchOn();
		iTelevision.volume();
		iTelevision.intetnetConnect();
		iTelevision.SwitchOff();

		return iTelevision;
	}

	protected abstract ITelevision manufactureTelvision(String model);
}
