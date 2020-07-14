package Sriman_Sir_15;

public class VoterTesting {
	public static void main(String[] args) {
		try{
			Voter v = null;
				v = new Voter();
				v.voteragevalidChecked(18);
		}catch(VoterAgeValidException e){
			e.printStackTrace();
			System.out.println("Continue rest of the code normally.....");
		}
	}
}
