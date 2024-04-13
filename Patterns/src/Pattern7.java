
public class Pattern7 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int x = 1; x <= i; x++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= 1; j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5-i; j++)
			{
				System.out.print(" ");
			}
			for(int x = 1; x <= 2*i-1; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
