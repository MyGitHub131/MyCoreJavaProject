package com.simcard.fmd.beans;

public class PuneSimCardWorkShop extends GurgaonSimCardWorkShop {

	@Override
	protected ISimCard manufactureSimCard(String type) {
		ISimCard iSimCard = null;

		if (type.equals("bsnl")) {
			iSimCard = new BsnlSimCard();
		} else if (type.equals("reliance")) {
			iSimCard = new RelianceSimCard();
		}
		return iSimCard;
	}

}
