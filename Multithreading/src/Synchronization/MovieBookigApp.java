package Synchronization;

public class MovieBookigApp extends Thread
{
	int seats;
	static BlockSynchronization bs;
	//static MethodSynchronization ms;
	public void run()
	{
		//ms.bookSeats(seats);
		bs.bookSeats(seats);
	}

	public static void main(String[] args) {

		//ms = new MethodSynchronization();
		bs = new BlockSynchronization();
		
		MovieBookigApp mb1 = new MovieBookigApp();
		mb1.seats = 6;
		mb1.start();
		
		MovieBookigApp mb2 = new MovieBookigApp();
		mb2.seats = 5;
		mb2.start();
		
		
	}

}
