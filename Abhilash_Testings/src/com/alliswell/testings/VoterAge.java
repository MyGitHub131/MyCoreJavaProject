
package com.alliswell.testings;

import java.util.Scanner;

public class VoterAge {
	public void voterAgevalidChecked(int age) throws YoungerAgeInvalidException, ElderAgeInvalidException {
		if (age < 18) {
			throw new YoungerAgeInvalidException(
					"Your age is invalid no chance of getting married right now !!! : " + age);
		} else if (age > 25) {
			throw new ElderAgeInvalidException(
					"Your married age is already crossed there is no chance of getting married !!! : " + age);
		} else {
			System.out.println("Congrats !!!... You are elgible to get married...");
			System.out.println("Please wait some more time you will get best match very soon through e-mail...");
		}
	}

	public static void main(String[] args) throws ElderAgeInvalidException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the age : ");
		Integer temp = sc.nextInt();
		sc.close();
		try {                                
			VoterAge va = null;
			va = new VoterAge();
			va.voterAgevalidChecked(temp);

		} catch (YoungerAgeInvalidException e) {
			e.printStackTrace();
		} catch (ElderAgeInvalidException e) {  
			e.printStackTrace();
		}
	}
}