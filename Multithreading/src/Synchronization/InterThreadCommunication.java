package Synchronization;
class TotalEarning extends Thread
{
	int total = 0;
	
	public void run()
	{
		synchronized(this)
		{
			for(int i = 0; i < 10; i++)
			{
				total = total + 100;
			}
			this.notify();
		}
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {

		TotalEarning t = new TotalEarning();
		t.start();
		
		synchronized(t)
		{
			t.wait();
			System.out.println("Total Earning: "+t.total);
		}
	}
}
