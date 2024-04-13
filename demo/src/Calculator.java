import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Choose the operator(+,-,/,* )");
		String symb = sc.next();
		
		int result;
		
		switch(symb) {
		
			case "+": result = num1+num2;
			System.out.println("Sum: "+result);
			break;
			
			case "-": result = num1-num2;
			System.out.println("Sub: "+result);
			break;
			
			case "*": result = num1 * num2;
			System.out.println("Mul: "+result);
			break;
			
			case "/": result = num1/num2;
			System.out.println("Div: "+result);
			break;
			
			default: System.out.println("You enter the wrong operator");
			break;
		}
		

	}

}
