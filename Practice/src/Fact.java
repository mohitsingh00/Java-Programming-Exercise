import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		fac(num);
		
	/*	for(int i = 1; i <= num ; i++)
		{
			fact = fact * i;
		}
		 
		System.out.println("Factorial of "+num+" is "+ fact);	*/
	}
	
	private static void fac(int num)
	{
		int fact = 1;
		if(num >= 1) 
		{
			fact = fact * num;
		}
		fac(num-1);
		System.out.println("Factorial of "+num+" is "+ fact);
		
		
	}

}
