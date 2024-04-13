import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream1 {

	public static void main(String[] args) throws IOException {

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt"));
		String data = "\nEnsure that you handle exceptions properly when working with file I/O operations, as shown in the catch block above.";
		
		bos.write(data.getBytes());
		bos.close();
		System.out.println("Task Complete...");
	}

}
