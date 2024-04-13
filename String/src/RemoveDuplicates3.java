import java.util.Scanner;
//This program will not work for sentences with spaces
public class RemoveDuplicates3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		sc.close();
		
		duplicate(str);
	}
	public static void duplicate(String str)
	{
		String res = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			boolean check = false;
			for(int j = i+1; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					check = true;
					break;
				}
			}
			
			//If 'check' is still false, it means character at index i is not duplicate
			if(!check)
			{
				res = res + str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
