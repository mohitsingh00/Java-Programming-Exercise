package source;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.print("Enter a Year: ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (isLeapYear(year)) {
            System.out.println("This is leap Year");
        } else {
            System.out.println("This is not a leap Year");
        }
    }

    public static boolean isLeapYear(int year)
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
