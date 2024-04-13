
public class Pattern6 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5-i; j++)
			{
				System.out.print(" ");
			}
			for(int x = 1; x <= i; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a = 1; a <= 5; a++)
		{
			for(int b = 1; b <= a; b++)
			{
				System.out.print(" ");
			}
			for(int c = 4; c >= a; c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
