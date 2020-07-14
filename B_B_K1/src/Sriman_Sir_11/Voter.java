package Sriman_Sir_11;

public class Voter {
	
	public void voteragevalidCheck(int age)throws VoterAgeValidException {
		
		if(age<18){
			throw new VoterAgeValidException("Voter age is too young it is not eligible to give a vote :"+age);
		}
		else{
			System.out.println("Voter eligible to give a vote...");
		}
	}

}
