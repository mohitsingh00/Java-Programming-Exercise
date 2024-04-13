//Performing single task from single thread
public class MyThread1 extends Thread 
{
	public void run()
	{
		System.out.println("Task 1");
	}
	 
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		t1.start();
	}

}
