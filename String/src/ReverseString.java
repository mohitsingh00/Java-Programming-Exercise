import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String rev = " ";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = sc.next();
		sc.close();
		
		for(int i = name.length()-1; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		
		System.out.println("The reverse name : "+rev);
		
	}

}
