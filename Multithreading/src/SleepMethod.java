//sleep method is static method so it is not necessary to extends Thread method
public class SleepMethod extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 6; i++)
		{
			System.out.println(i+" : "+Thread.currentThread().getName());
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		SleepMethod sm = new SleepMethod();
		sm.start();
		
		SleepMethod sm1 = new SleepMethod();
		sm1.start();
	}

}
