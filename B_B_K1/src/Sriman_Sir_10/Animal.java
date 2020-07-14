package Sriman_Sir_10;

public class Animal {
	private String name;
	private int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
		if(age<0)
		{
			throw new AgeAnimalException("An Animal object can't have a negative age :"+age);
		}
		else{
			System.out.println("We have create a dog");
		}
	}
}
