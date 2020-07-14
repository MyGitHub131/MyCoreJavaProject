package CustomizeException;

public class TestCustomizeException {
	public static void main(String[] args) {
		Animal dog = null;
		
		try
		{
			dog = new Animal("Dog", -2);
		}catch(AgeAnimalException e){
			System.out.println(e.getMessage());
		}
	}

}
