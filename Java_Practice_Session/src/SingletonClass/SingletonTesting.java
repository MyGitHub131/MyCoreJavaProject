package SingletonClass;

public class SingletonTesting {
	public static void main(String[] args) {
		
		SingletonDP x = SingletonDP.getInstance();
		SingletonDP y = SingletonDP.getInstance();
		SingletonDP z = SingletonDP.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		System.out.println("..................................................................................");
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
