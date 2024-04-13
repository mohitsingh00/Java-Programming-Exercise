import java.util.regex.*;

public class Regex1 {

	public static void main(String[] args) {
		
		String str = "ababbaab";
		
		Pattern pat = Pattern.compile("ab");
		Matcher match = pat.matcher(str);
		
		while(match.find())
		{
			System.out.println(match.start()+"...."+match.group());
		}
	}

}
