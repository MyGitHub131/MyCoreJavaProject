package Pizza.Factory.DesignPattern_03;

public class PizzaFactory {
	public static IPizza orderPizza(String str)
	{
		if(str.equals("MPizza"))
		{
			return new VegePizza();
		}
		else if(str.equals("CPizza"))
		{
		 	return new NonVegePizza();
		}
		else{
			return new VegePizza();
		}
		
	}
}
