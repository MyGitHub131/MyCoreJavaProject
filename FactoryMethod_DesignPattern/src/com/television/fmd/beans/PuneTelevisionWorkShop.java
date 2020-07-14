package com.television.fmd.beans;

public class PuneTelevisionWorkShop extends DelhiNcrTelevisionWorkShop {

	@Override
	protected ITelevision manufactureTelvision(String model) {
		ITelevision iTelevision = null;
		
		if (model.equals("konark")) {
			iTelevision = new KonarkaTelevision();
		}
		else if (model.equals("micro")) {
			iTelevision = new MicromaxTelevision();
		}
		return iTelevision;
	}

}
