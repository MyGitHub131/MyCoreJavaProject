package CustomizeException;

public class Animal {
	private String name;
	private int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		if(age<0)
		{
			throw new AgeAnimalException("An animal object can't have negative age :"+age);
		}
		else
		{
			System.out.println("We have create a dog...");
		}
	}
}
