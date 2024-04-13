import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\s");
		String[] m = p.split("This is demo");
		
		for(String s1:m)
		{
			System.out.println(s1);
		}
		
		
	}

}
