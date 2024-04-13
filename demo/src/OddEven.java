import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("Number is Even");
		}
			else {
				System.out.println("Number is Odd");
			}
		}
}
