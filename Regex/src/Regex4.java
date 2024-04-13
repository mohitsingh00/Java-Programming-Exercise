import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m = p.matcher("919879762654");
		
		//For mailID: [a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-Z0-9][[.][a-zA-Z]+]+
		
		if(m.matches())
		{
			System.out.println("The Number is valid.");
		}
		else
		{
			System.out.println("The Number is not valid.");
		}
	}
}
