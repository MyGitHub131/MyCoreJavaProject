package Calc;

public class CalculationTest {
	public static void main(String[] args) {
	Calculation	obj = new Calculation();
		obj.num1 = 12;
		obj.num2 = 25;
		
		obj.perform();
		System.out.println("Calculation Numbner :"+obj.result);
	}

}
