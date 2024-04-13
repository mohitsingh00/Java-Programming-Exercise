import java.util.Scanner;
//This program will not work for sentences with spaces
public class RemoveDuplicates1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		sc.close();
		duplicates(str);
	}
	public static void duplicates(String str)
	{
		String res = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			//Storing each character from string in ch
			//char ch = str.charAt(i);
			
			//Checking if the character 'ch' present in the "res" string at any index
			//If not then it will return -1 That means it is unique character
			if(res.indexOf(str.charAt(i)) == -1)
			{
				res = res + str.charAt(i);
			}
		}
		System.out.print("After removing duplicates: "+res);
	}

}
