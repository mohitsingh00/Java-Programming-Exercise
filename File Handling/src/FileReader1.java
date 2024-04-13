import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt");
		System.out.println("Ready to read?: "+fr.ready());
		char arr[] = new char[100];
		fr.read(arr);
		System.out.println(arr);
		fr.close();
	}

}
