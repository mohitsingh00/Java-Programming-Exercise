import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt");
		pw.print("This is PrintWriter class.\n");
		pw.printf("The percent of marks is %d", 76);
		pw.close();
	}

}
