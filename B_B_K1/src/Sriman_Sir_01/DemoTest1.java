package Sriman_Sir_01;

public class DemoTest1 {
	public static void main(String...args){
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		
		Thread.currentThread().setName("Bibhuti");
		System.out.println(Thread.currentThread().getName());
	}

}