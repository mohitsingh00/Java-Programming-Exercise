package ExceptionHandling;

public class PrintExceptionInfo {

	public static void main(String[] args) {
		
		int a = 100, b = 0, c;
		
		try
		{
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			//Print only the description of exception
			System.out.println(e.getMessage());
			
			//Print the name and description of the exception
			//Print the name, description and stack trace of the exception
			e.printStackTrace();
		}

	}

}
