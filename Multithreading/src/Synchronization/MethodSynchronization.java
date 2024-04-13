package Synchronization;

public class MethodSynchronization {

	int total = 10;
	
	synchronized void bookSeats(int seats)
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
