package source;

public class RecFactorial {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Factorial of "+num+" is "+fact(num));

	}
	
	public static int fact(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
		
	}

}
