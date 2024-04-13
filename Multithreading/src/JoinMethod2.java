
public class JoinMethod2 extends Thread
{
	static Thread t;
	public void run() 
	{
		try 
		{
			t.join();
			for(int i = 0; i < 6; i++)
			{
				System.out.println(i+" : "+Thread.currentThread().getName());
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		//Creating a reference to the Thread class to invoke join method
		t = Thread.currentThread();
		
		JoinMethod2 j = new JoinMethod2();
		j.start();
		//j.join();
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
