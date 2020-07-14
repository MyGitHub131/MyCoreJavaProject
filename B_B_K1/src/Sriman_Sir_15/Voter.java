package Sriman_Sir_15;

public class Voter {
	public void voteragevalidChecked(int age)throws VoterAgeValidException
	{
		if(age<18)
		{
			throw new VoterAgeValidException("Voter is not eligible to give a vote :"+age);
		}
		else
		{
			System.out.println("Voter is eligible to give a vote...");
		}
	}
}
