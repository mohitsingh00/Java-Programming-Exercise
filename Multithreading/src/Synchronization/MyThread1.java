package Synchronization;

public class MyThread1 extends Thread
{
	StaticSynchronizationDemo ss; 
	int seats;
	
	MyThread1(StaticSynchronizationDemo ss , int seats)
	{
		this.ss = ss;
		this.seats = seats;
	}
	public void run()
	{
		ss.bookSeats(seats);
	}
}

class MyThread2 extends Thread
{
	StaticSynchronizationDemo ss; 
	int seats;
	
	MyThread2(StaticSynchronizationDemo ss , int seats)
	{
		this.ss = ss;
		this.seats = seats;
	}
	public void run()
	{
		ss.bookSeats(seats);
	}
}
