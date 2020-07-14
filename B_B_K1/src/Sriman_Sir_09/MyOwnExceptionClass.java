package Sriman_Sir_09;

public class MyOwnExceptionClass extends Exception {
	private int price;

	public MyOwnExceptionClass(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price should not be in negative you are entered"+price;
	}
}
