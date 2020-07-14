package com.alliswell.factory.beans;

public class GurgaonVegPizzaFactoryShop extends DominosPizzaShop {

	@Override
	protected IPizza makingPizza(String type) {
		IPizza iPizza = null;
		if (type.equalsIgnoreCase("MashroomPizza")) {
			iPizza = new MashroomPizza();
		} else if (type.equalsIgnoreCase("PaneerPizza")) {
			iPizza = new PaneerPizza();
		}
		return iPizza;
	}

}
