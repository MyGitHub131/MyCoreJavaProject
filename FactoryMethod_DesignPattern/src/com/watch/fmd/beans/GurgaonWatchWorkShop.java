package com.watch.fmd.beans;

public class GurgaonWatchWorkShop extends BangaloreWatchWorkShop {

	@Override
	protected IWatch manufactureWatch(String model) {
		IWatch watch = null;

		if (model.equals("rolex")) {
			watch = new RolexWatch();
		} else if (model.equals("sony")) {
			watch = new SonyWatch();
		}
		return watch;
	}

}
