import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.next();
		sc.close();
		
		String rev = "";

		for(int i = s.length()-1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}

}
