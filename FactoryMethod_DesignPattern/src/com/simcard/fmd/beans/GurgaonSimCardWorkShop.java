package com.simcard.fmd.beans;

abstract public class GurgaonSimCardWorkShop {
	public ISimCard orderSimCard(String type) {
		ISimCard iSimCard = null;

		iSimCard = manufactureSimCard(type);
		System.out.println("quality checking all simcard properly...");
		System.out.println("packing properly...");
		System.out.println("delivery proper location...");
		
		iSimCard.activate();
		iSimCard.call();
		iSimCard.browsedata();
		iSimCard.textMessage();
		iSimCard.deactivate();

		return iSimCard;
	}

	protected abstract ISimCard manufactureSimCard(String type);
}
