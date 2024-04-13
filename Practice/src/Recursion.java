
public class Recursion {

	public static void main(String[] args) {
		
		int n = 10;
		number(n);
	}
	
	public static void number(int num)
	{
		if(num < 1)
		{
			return;
		}
		else 
		{
			System.out.println(num);
			num = num - 1;
		}
		number(num);	
	}

}
