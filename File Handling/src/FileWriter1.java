import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt");
		fw.write("This is first line in output file.\n");
		fw.append("This is append Line.");
		fw.close();
	}

}
