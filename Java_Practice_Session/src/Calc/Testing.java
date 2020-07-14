package Calc;

public class Testing {
	public static void main(String[] args) {
		String s1 ="bibhu";
		String s2 ="bibhu";
		
		String s3 = new String("bibhu");
		String s4 = new String("bibhu");
		
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s3.hashCode()==s4.hashCode());
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
	}

}
