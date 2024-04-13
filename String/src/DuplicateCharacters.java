import java.util.Scanner;
public class DuplicateCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		sc.close();
		
		duplicate(str);
	}
	
	public static void duplicate(String str)
	{
		char[] ch = str.toCharArray();
		
		System.out.print("\nThe Duplicate characters are: ");
		for(int i = 0; i < ch.length; i++)
		{
			int count  = 0;
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] == ch[j] && ch[j] != ' ')
				{
					count++;
					
				  //Marks the duplicate character as '0' to ensure it's not counted again
					ch[j] = '0';
				}
			}
			
			//This program will not work if string contains "0" in it.
			if(count > 0 && ch[i] != '0')
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
}