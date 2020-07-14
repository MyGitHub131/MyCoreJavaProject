package Singleton;

public class SingletonTesting {
	private static DateUtil du2;
	public static void main(String[] args) {
		
	DateUtil x = DateUtil.getInstance();
	DateUtil y = DateUtil.getInstance();
	DateUtil z = DateUtil.getInstance();
	
	x.str = (x.str).toUpperCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	System.out.println("......................................................");
	
	z.str = (z.str).toLowerCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	/*DateUtil du1 = DateUtil.getInstance();
	
	System.out.println("du==du1 :"+(du1==du1));
	System.out.println("du1==du2 :"+(du1==du2));*/
	
	}

}
