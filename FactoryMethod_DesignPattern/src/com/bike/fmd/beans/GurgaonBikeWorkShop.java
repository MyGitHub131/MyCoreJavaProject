package com.bike.fmd.beans;

public class GurgaonBikeWorkShop extends HondaBikeWorkShop {

	@Override
	protected IBike manufactureBike(String model) {
		IBike iBike = null;
		
		if (model.equals("shine")) {
			iBike = new HondaShineBike();
		}
		else if (model.equals("pulsure")) {
			iBike = new BajajPulsureBike();
		}
		else if (model.equals("splender")) {
			iBike = new HeroSplenderBike();
		}
		return iBike;
	}

}
