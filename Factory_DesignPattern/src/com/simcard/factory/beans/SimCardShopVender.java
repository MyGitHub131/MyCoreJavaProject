package com.simcard.factory.beans;

public class SimCardShopVender {
	public static ISimCard orderSimCard(String type)
	{
		ISimCard iSimCard = null;
		
		iSimCard = SimCardFactory.manufactureSimCard(type);
		iSimCard.activate();
		iSimCard.call();
		iSimCard.browsedata();
		iSimCard.textMessage();
		iSimCard.deactivate();
		
		return iSimCard;
	}
	
}
