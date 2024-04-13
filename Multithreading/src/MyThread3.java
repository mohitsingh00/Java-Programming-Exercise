class MyThread4 extends Thread 
{
	public void run()
	{
		System.out.println("Task 1");
	}
}

class MyThread5 extends Thread 
{
	public void run()
	{
		System.out.println("Task 2");
	}
}

public class MyThread3 {

	public static void main(String[] args) {

		MyThread4 t1 = new MyThread4();
		t1.start();
		
		MyThread5 t2 = new MyThread5();
		t2.start();
		
	}

}
