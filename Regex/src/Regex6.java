import java.io.*;
import java.util.regex.*;
public class Regex6 {

	public static void main(String[] args) {

		int count = 0;
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.](java|class)");
		File f = new File("C:\\Users\\DELL\\Documents\\Java Programs");
		String [] s = f.list();
		
		for(String s1 : s)
		{
			Matcher m = p.matcher(s1);
			if(m.find()&& m.group().equals(s1)) 
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("The total files: "+count);
	}
}
