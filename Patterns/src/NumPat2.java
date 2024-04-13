
public class NumPat2 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			for(int x = i-1; x >= 1; x--)
			{
				System.out.print(x);
			}
			System.out.println();
		}

		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i ; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
		for(int i = 1; i <= 5; i++)
		{
			int no = i;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(no);
				no = no + 5 - j;
			}
			System.out.println();
		}
	}

}
