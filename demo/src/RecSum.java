
public class RecSum {

	public static void main(String[] args) {

		int num = 3;
		
		System.out.print("sum: "+add(num));
	}
	
	private static int add(int n)
	{
		//int sum = 0;
		if(n != 0)
		{
			return n + add(n-1);
		}
		else
		{
			return n;
		}
	
		//return sum = n + add(n-1);
	}
}
