import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream1 {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream ps = new PrintStream("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt");
		ps.println("This is demo line.");
		ps.print("This is another line.");
		int age = 25;
		ps.printf("\nThe age of man is %d", age);
		
		ps.close();
	}

}
