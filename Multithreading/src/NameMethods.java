public class NameMethods extends Thread
{
	public void run()
	{
		System.out.println("Task 1: "+Thread.currentThread().getName());
	}
	 
	public static void main(String[] args) 
	{
		System.out.println("Hello: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Mohit");
		System.out.println(Thread.currentThread().getName());
		
		NameMethods t1 = new NameMethods();
		t1.start();
		
		NameMethods t2 = new NameMethods();
		t2.start();
		
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t2.isAlive());
	}
}
