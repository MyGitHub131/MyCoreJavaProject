package com.bike.fmd.beans;

public class AhemdabadBikeWorkShop extends HondaBikeWorkShop {

	@Override
	protected IBike manufactureBike(String model) {
		IBike iBike = null;
		
		if (model.equals("duke")) {
			iBike = new SuzukiDukeBike();
		}
		return iBike;
	}

}
