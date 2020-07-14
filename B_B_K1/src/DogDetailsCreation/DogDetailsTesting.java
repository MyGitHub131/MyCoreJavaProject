package DogDetailsCreation;

public class DogDetailsTesting {
	public static void main(String[] args) {
		Dog tuffy = new Dog("Chameli", "Chicken", "Brown", 21);
		System.out.println(tuffy.toString());
		
		System.out.println("******************************************************************************************");
		
		Dog tuffy1 = new Dog("Papi", "Mutton", "yellow", 27);
		System.out.println(tuffy1.toString());
	}
}
