import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.print("Enter a Year: ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%400==0 || year%4==0 && year%100!=0) 
		{
			System.out.println("This is leap Year");
		}
		else
		{
			System.out.println("This is not a leap Year");
		}

	}

}
