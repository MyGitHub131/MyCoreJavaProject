package Sriman_Sir_10;

public class MainClass {
	public static void main(String[] args){
		Animal dog = null;
		try{
			dog = new Animal("I am a dog", -2);
		}catch(AgeAnimalException e){
			e.printStackTrace();
		}
	}

}
