package com.alliswell.factory.beans;

public class AhemadabadaNonVegPizzaFactoryShop extends DominosPizzaShop {

	@Override
	protected IPizza makingPizza(String type) {
		IPizza iPizza = null;
		if (type.equalsIgnoreCase("ChickenPizza")) {
			iPizza = new ChickenPizza();
		} else if (type.equalsIgnoreCase("MuttonPizza")) {
			iPizza = new MuttonPizza();
		} else if (type.equalsIgnoreCase("FishPizza")) {
			iPizza = new FishPizza();
		} else if (type.equalsIgnoreCase("CrabPizza")) {
			iPizza = new CrabPizza();
		} else if (type.equalsIgnoreCase("PrawnPizza")) {
			iPizza = new PrawnPizza();
		}
		return iPizza;
	}

}
