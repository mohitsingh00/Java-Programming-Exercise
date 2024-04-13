import java.util.regex.*;

public class Regex2 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-c[x-z]]");
		Matcher m = p.matcher("a7b@z2#9");
		
		while(m.find())
		{
			System.out.println(m.start()+"...."+m.group());
		}
		
	}

}
