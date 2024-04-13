import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt"));
		String data;
		while((data = br.readLine()) != null)
		{
			System.out.println(data);
		}
		br.close();
	}

}
