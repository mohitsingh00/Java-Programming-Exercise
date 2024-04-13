import java.util.Scanner;
//This program will not work for sentences with spaces
public class RemoveDuplicates2 {

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
			String ch = "" + str.charAt(i);
			if(res.contains(ch))
			{
				continue;
			}
			res+=ch;
		}
		System.out.println(res);
	}

}
