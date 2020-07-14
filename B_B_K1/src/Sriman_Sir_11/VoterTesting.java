package Sriman_Sir_11;

public class VoterTesting {
	public static void main(String[] args) {
		Voter v = null;
			v = new Voter();
		try{
			v.voteragevalidCheck(12);
		}catch(VoterAgeValidException e){
			//e.printStackTrace();
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
		System.out.println("rest of the code...");
	}

}
