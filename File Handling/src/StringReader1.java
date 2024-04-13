import java.io.IOException;
import java.io.StringReader;

public class StringReader1 {

	public static void main(String[] args) throws IOException {

		String s = "Unlock Your Potential";
		StringReader sr = new StringReader(s);
		int data;
		while((data = sr.read()) != -1)
		{
			System.out.print((char)data);
		}
	}

}
