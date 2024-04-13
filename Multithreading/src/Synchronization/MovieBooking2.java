package Synchronization;

public class MovieBooking2 {

	public static void main(String[] args) {

		StaticSynchronizationDemo ssb1 = new StaticSynchronizationDemo();
		MyThread1 m1 = new MyThread1(ssb1, 7);
		m1.start();
		
		MyThread2 m2 = new MyThread2(ssb1, 6);
		m2.start();
		
		
		StaticSynchronizationDemo ssb2 = new StaticSynchronizationDemo();
		MyThread1 m3 = new MyThread1(ssb2, 5);
		m3.start();
		
		MyThread2 m4 = new MyThread2(ssb2, 9);
		m4.start();
	}

}
