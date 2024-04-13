import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt");
		
		String s = "No, you cannot directly instantiate an interface in most programming languages, including Java and C#. An interface defines a contract for classes to implement, but it doesn't provide a concrete implementation itself. It's essentially a blueprint for classes that implement it.";
		fos.write(s.getBytes());
		
		String s1 = "\n Adding another line to this file";
		fos.write(s1.getBytes());
		
		fos.close();
		System.out.println("Task Finished...");
	}

}
