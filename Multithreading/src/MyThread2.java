//Performing single task from multiple threads
public class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
	 
	public static void main(String[] args) 
	{
		MyThread2 t1 = new MyThread2();
		t1.start();
		
		MyThread2 t2 = new MyThread2();
		t2.start();
		
	}

}
