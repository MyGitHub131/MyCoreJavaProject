package com.alliswell.beans;

public class VoterAgeInvalidException extends Exception {
	public VoterAgeInvalidException(String message) {
	}
}

class Voter {
	public void voterageValidChecked(int age) throws VoterAgeInvalidException {
		if (age < 18) {
			throw new VoterAgeInvalidException("Voter age is invalid : " + age);
		} else {
			System.out.println("VOter age is valid...");
			System.out.println("Congrats... You are elgible to give a vote... !!!");
		}
	}
}


