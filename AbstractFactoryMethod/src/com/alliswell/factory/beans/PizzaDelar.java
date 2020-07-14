package com.alliswell.factory.beans;

public class PizzaDelar {
	public static void main(String[] args) {
		DominosPizzaShop dominosPizzaShop = new AhemadabadaNonVegPizzaFactoryShop();
		IPizza iPizza = dominosPizzaShop.orderPizza("MuttonPizza");
	}
} 