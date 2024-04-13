
public class YieldThread extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 6; i++)
		{
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		YieldThread yt = new YieldThread();
		yt.start();
		
		Thread.yield();
		for(int i = 0; i < 6; i++)
		{
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}

}
