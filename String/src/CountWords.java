import java.util.Scanner;
public class CountWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("The total words are "+count(str));
	}
	
	private static int count(String str)
	{
		//count should be one because we are counting spaces
		int count = 1;
		
		str = str.trim();
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		return count;
	}
}
