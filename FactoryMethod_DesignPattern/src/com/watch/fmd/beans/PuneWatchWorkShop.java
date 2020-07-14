package com.watch.fmd.beans;

public class PuneWatchWorkShop extends BangaloreWatchWorkShop {

	@Override
	protected IWatch manufactureWatch(String model) {
		IWatch watch = null;

		if (model.equals("fastrack")) {
			watch = new FastrackWatch();
		} else if (model.equals("titanic")) {
			watch = new TitanicWatch();
		}
		return watch;
	}

}
