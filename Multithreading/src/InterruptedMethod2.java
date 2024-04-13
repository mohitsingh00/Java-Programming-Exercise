public class InterruptedMethod2 extends Thread
{
	public void run()
	{
		System.out.println("A1: "+Thread.interrupted());  //true -> false
		System.out.println("A2: "+Thread.interrupted());  //false
		System.out.println("B1: "+Thread.currentThread().isInterrupted());  //true
		//System.out.println("B2: "+Thread.currentThread().isInterrupted());  //true
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

		InterruptedMethod2 obj = new InterruptedMethod2();
		obj.start();
		obj.interrupt();
	}
}