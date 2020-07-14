package Sriman_Sir_18;

public class VarArgTesting {
	void add(int...numbers)
	{
		System.out.println("Add method of class varargtesting...");
	}
	public static void main(String[] args) {
		VarArgTesting vat = new VarArgTesting();
		vat.add(10,20,30,40,50);
	}

}
