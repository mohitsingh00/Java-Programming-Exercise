
public class RecFibonacci {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
		System.out.print(fibo(i)+"  ");
		}
	}
	
	private static int fibo(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else
		{
			return fibo(n - 1) + fibo(n - 2);
		}
	}

}
