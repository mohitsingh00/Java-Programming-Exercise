import java.util.Scanner;

public class MaxOccurCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		sc.close();
		
		//To remove the spaces from string but you can also count spaces as character
		str = str.replaceAll("\\s", "");
		System.out.println(str);
		
		max(str);	
	}
	
	private static void max(String str)
	{
		int max = 1;
		char c = ' ';
		
		//creating integer array to convert string character into ASCII value
		int[] arr = new int[256];
		
		for(int i = 0; i < str.length(); i++)
		{
			//Example: arr[97] = 0 + 1; Because 'a' ASCII value is 97
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			if(max < arr[str.charAt(i)])
			{
				max = arr[str.charAt(i)];
				c = str.charAt(i);
			}
			
		}
		
		/* If you want to print repeating character even if string does not have
		 * repeated characters 
		 * System.out.println("Max Occurring Character is: "+c);
		 */
		
		if(max > 1)
		{
			System.out.println("Max Occuring Character is: "+c);
		}
		else
		{
			System.out.println("String does not have repeated characters");
		}
	}

}
