package com.pizza.fmd.beans;

public class GurgaonNonvegPizzaShop extends DominasPizzaShop {

	@Override
	protected IPizza createPizza(String type) {
		IPizza iPizza = null;

		if (type.equals("chicken")) {
			iPizza = new ChickenPizza();
		} else if (type.equals("mutton")) {
			iPizza = new MuttonPizza();
		} else if (type.equals("fish")) {
			iPizza = new FishPizza();
		} else if (type.equals("prawn")) {
			iPizza = new PrawnPizza();
		}
		return iPizza;
	}

}
