import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int rev = 0, rem;
		
		while(temp!=0)
		{
			rem = temp % 10;
			temp = temp / 10;
			rev = rev * 10 + rem;
		}
		
		if(num == rev)
		{
			System.out.println(num+" number is Palindrome Number");
		}
		else
		{
			System.out.println(num+" number is not Palindrome Number");
		}

	}

}
