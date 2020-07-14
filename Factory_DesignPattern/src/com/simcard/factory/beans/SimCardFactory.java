package com.simcard.factory.beans;

public class SimCardFactory {
	public static ISimCard manufactureSimCard(String type) {
		ISimCard iSimCard = null;

		if (type.equals("airtel")) {
			iSimCard = new AirtelSimCard();
		} else if (type.equals("jio")) {
			iSimCard = new JioSimCard();
		} else if (type.equals("vodafone")) {
			iSimCard = new VodafoneSimCard();
		} else if (type.equals("bsnl")) {
			iSimCard = new BsnlSimCard();
		} else if (type.equals("reliance")) {
			iSimCard = new RelianceSimCard();
		}
		return iSimCard;
	}
}
