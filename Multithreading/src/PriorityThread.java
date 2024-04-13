
public class PriorityThread extends Thread 
{
	public void run()
	{
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		System.out.println("Old Priority: "+Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(MAX_PRIORITY);
		
		System.out.println("New Priority: "+Thread.currentThread().getPriority());
		
		PriorityThread  pt = new PriorityThread();
		pt.start();
		
	}

}
