package Sriman_Sir_17;

public class ThreadDemo {
public static void main(String[] args) {
	MyThread t1 = new MyThread();
		t1.start();
		for(int i=0; i<7; i++)
		{
			System.out.println("Main Thread...");
		}
} 
}
