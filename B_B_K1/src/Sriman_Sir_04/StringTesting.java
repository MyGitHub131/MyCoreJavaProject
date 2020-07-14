package Sriman_Sir_04;

public class StringTesting {
	public static void main(String[] args) {
		
		String s1 ="durga";
		String s2 ="durga";
		String s3 = new String("durga");
		String s4 = new String("durga");
		String s5 = new String("xyz");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
	}
}
