
public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 2; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int x = 5; x >= i; x--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
