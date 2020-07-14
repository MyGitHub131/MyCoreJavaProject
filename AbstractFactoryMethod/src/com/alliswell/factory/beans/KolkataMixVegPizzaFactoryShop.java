package com.alliswell.factory.beans;

public class KolkataMixVegPizzaFactoryShop extends DominosPizzaShop {

	@Override
	protected IPizza makingPizza(String type) {
		IPizza iPizza = null;
		if (type.equalsIgnoreCase("MixVegPizza")) {
			iPizza = new MixVegPizza();
		}
		return iPizza;
	}

}
