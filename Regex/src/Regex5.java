//To Extract all valid mobile no. or mail IDs from text file
import java.io.*;
import java.util.regex.*;

public class Regex5 {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("D:\\Output.txt");
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-Z0-9][[.][a-zA-Z]+]+");
		BufferedReader br = new BufferedReader(new FileReader("D:\\Input.txt"));
		
		String line = br.readLine();
		while(line != null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				pw.println(m.group());
			}
			line = br.readLine();
		}
		pw.flush();
		System.out.println("Print Successfully!!");
	}

}