package com.television.fmd.beans;

public class GurgaonTelevisionWorkShop extends DelhiNcrTelevisionWorkShop {

	@Override
	protected ITelevision manufactureTelvision(String model) {
		ITelevision iTelevision = null;

		if (model.equals("sony")) {
			iTelevision = new SonyTelevision();
		} else if (model.equals("lg")) {
			iTelevision = new LGTelevision();
		} else if (model.equals("videocon")) {
			iTelevision = new VideoconTelevision();
		}
		return iTelevision;
	}

}
