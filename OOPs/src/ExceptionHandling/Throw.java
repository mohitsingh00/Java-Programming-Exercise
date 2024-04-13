package ExceptionHandling;
import java.util.Scanner;

class YoungerException extends RuntimeException
{
	YoungerException(String msg)
	{
		super(msg);
	}
}
public class Throw
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age:");
		int age = sc.nextInt();
		
		try
		{
		if(age < 18)
		{
			throw new YoungerException("You are not eligible for vote");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Hello");

	}

}
