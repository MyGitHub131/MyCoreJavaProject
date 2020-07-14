package DogDetailsCreation;

public class Dog {
	
	String name;
	String breed;
	String color;
	int age;
	
	public Dog(String name, String breed, String color, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", color=" + color + ", age=" + age + "]";
	}
}
