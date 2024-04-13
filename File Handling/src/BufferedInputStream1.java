import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream1 {

	public static void main(String[] args) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt"));
		
		int data;
		while((data = bis.read()) != -1)
		{
			System.out.print((char)data);
		}
		bis.close();
	}

}
