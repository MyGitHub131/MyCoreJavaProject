package com.simcard.fmd.beans;

public class DelhiNcrSimCardWorkShop extends GurgaonSimCardWorkShop {

	@Override
	protected ISimCard manufactureSimCard(String type) {
		ISimCard iSimCard = null;

		if (type.equals("airtel")) {
			iSimCard = new AirtelSimCard();
		} else if (type.equals("jio")) {
			iSimCard = new JioSimCard();
		} else if (type.equals("vodafone")) {
			iSimCard = new VodafoneSimCard();
		}
		return iSimCard;
	}

}
