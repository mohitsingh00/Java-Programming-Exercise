import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int temp=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(num == 0 || num == 1)
		{
			System.out.println("The number is not prime");
		}
		
		for(int i = 2; i<=num-1; i++)
		{
			if(num%i==0) 
			{
				temp++;
			}
		}
		if(temp > 0)
		{
			System.out.println("The number is not prime");
		}
		else 
		{
			System.out.println("The number is prime");
		}

	}

}
