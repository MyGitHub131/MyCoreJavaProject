package Sriman_Sir_12;

public class SingletonTesting {
	private static SingletonDesignPattern sdp2;
	public static void main(String[] args) {
		SingletonDesignPattern sdp1 = SingletonDesignPattern.getobject();
		System.out.println("sdp==sdp1 :"+(sdp1==sdp1));
		System.out.println("sdp1==sdp2 :"+(sdp1==sdp2));
	}

}
