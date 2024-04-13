
public class DaemonThread extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else
		{
			System.out.println("Child Thread");
		}
		
	}

	public static void main(String[] args) {

		System.out.println("Main Thread");
		DaemonThread obj = new DaemonThread();
		obj.setDaemon(true);
		obj.start();
	}

}
