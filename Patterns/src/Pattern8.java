
public class Pattern8 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int x = 11; x > (2*i); x--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int x = 5; x >= i; x--)
			{
				System.out.print("*");
			}
			for(int y = 4; y >= i; y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 5; i >= 1; i--)
		{
			for(int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int x = 1; x < (2*i); x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
