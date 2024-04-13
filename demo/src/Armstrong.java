import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int length = 0;
		int t1 = num;
		int t2 = num;
		int rem;
		int arm = 0;
		
		while(t1 != 0)
		{
			t1 = t1 / 10;
			length  = length + 1;
			
		}
		
		while(t2 != 0)
		{
			int mul = 1;
			rem = t2 % 10;
			for (int i = 1; i<=length; i++)
			{
				mul = mul * rem;
			}
			
			arm = arm + mul;
			t2 = t2 / 10;
		}
		
		if (arm == num)
		{
			System.out.println(num+" is Palindrome Number");
		}
		else 
		{
			System.out.println(num+" is not a Palindrome Number");
		}

	}

}
