package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		int a = 100, b = 0, c;
		
		try
		{
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I'm in finally block");
		}

	}

}
