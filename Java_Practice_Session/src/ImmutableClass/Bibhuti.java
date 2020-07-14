package ImmutableClass;

public final class Bibhuti {
	private final String name;
	private final int age;
	
	private  Bibhuti(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Bibhuti [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Bibhuti a = new Bibhuti("bibhuti", 22);
		Bibhuti a1 = new Bibhuti("ghskag", 12);
		System.out.println("" + a + a1);
	}
}
