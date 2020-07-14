package com.pizza.fmd.beans;

public class PuneVegPizzaShop extends DominasPizzaShop {

	@Override
	protected IPizza createPizza(String type) {
		IPizza iPizza = null;

		if (type.equals("mashroom")) {
			iPizza = new MashroomPizza();
		} else if (type.equals("panner")) {
			iPizza = new PannerPizza();
		} else if (type.equals("mixveg")) {
			iPizza = new MixvegPizza();
		} else if (type.equals("banana")) {
			iPizza = new BananaPizza();
		}
		return iPizza;
	}

}
