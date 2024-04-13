package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		int a = 100, b = 0, c;
		
		try
		{
			c = a / b;
			System.out.println(c);
		}
		
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Hello");	
	}

}
