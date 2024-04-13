class MedicalExamine extends Thread
{
	public void run()
	{
		try 
		{
			System.out.println("Medical Examine Started");
			Thread.sleep(3000);
			System.out.println("Medical Examine Completed");
			System.out.println("---------------------------------------------------------------");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
class TestDrive extends Thread
{
	public void run()
	{
		try 
		{
			Thread.sleep(1000);
			System.out.println("Test Drive Started");
			Thread.sleep(3000);
			System.out.println("Test Drive Completed");
			System.out.println("---------------------------------------------------------------");
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class OfficerSign extends Thread
{
	public void run()
	{
		try 
		{
			Thread.sleep(1000);
			System.out.println("Officer took the file");
			Thread.sleep(3000);
			System.out.println("Officer sign the file");
			System.out.println("---------------------------------------------------------------");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
public class JoinMethod
{
	public static void main(String[] args) throws InterruptedException {

		MedicalExamine me = new MedicalExamine();
		me.start();
		me.join(); //TestDrive and OfficerSign thread will to complete MedicalExamine thread
		
		TestDrive td = new TestDrive();
		td.start();
		td.join(); //OfficerSign thread will to complete TestDrive thread
		
		OfficerSign os = new OfficerSign();
		os.start();
		os.join();
		
		Thread.sleep(1000);
		System.out.println("License Completed");
	}
}
