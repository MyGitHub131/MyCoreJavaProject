package Sriman_Sir_16;

public class StaticComponets {
	static int staticVariable;
	
	static
	{
		System.out.println("StaticComponets...SIB");
		staticVariable = 10;
	}
	static void staticMethod()
	{
		System.out.println("From staticMethod...");
		System.out.println(staticVariable);
	}

}
