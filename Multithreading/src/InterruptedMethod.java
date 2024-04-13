
public class InterruptedMethod extends Thread
{
	public void run()
	{
		try 
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println(i);
			    Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Your thread has been Interrupted");
		}
	}

	public static void main(String[] args) {

		InterruptedMethod obj = new InterruptedMethod();
		obj.start();
		obj.interrupt();
		
	}

}
