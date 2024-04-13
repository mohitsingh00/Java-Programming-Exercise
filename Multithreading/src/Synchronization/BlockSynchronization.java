package Synchronization;

public class BlockSynchronization {

	int total = 10;
	
	void bookSeats(int seats)
	{
		synchronized (this)
		{
			if(total >= seats)
			{
				System.out.println(seats+" Seats are booked Successfully");
				total = total-seats;
				System.out.println("Seats Left: "+total);
			}
			else
			{
				System.out.println("\n"+seats+" Seats cannot be booked");
				System.out.println("Seats Left: "+total);
			}
		}
	}

}
