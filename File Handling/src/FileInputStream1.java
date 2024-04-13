import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt");

			int count = fis.available();
			System.out.println("Number of bytes in file: " + count);

			int data;
			System.out.print("The content on file: ");
			while((data = fis.read()) != -1) 
			{ 
				System.out.print((char)data);
			}
			fis.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
