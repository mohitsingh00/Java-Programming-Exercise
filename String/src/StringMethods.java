
public class StringMethods {

	public static void main(String[] args) {
		
		//.length method, Returns int value
		String s1 = new String("Mark");
		System.out.println("Length of s1: "+s1.length());
		
		//.isEmpty() method, Returns boolean value
		System.out.println("Is s1 is empty: "+s1.isEmpty());
		
		//.trim() for remove beginning & ending spaces from string, Returns String
		String s2 = "  Hello    ";
		System.out.println("Removing the spaces: "+s2.trim());
		
		//.equals() method for checks the content of strings, Returns boolean value
		String s3 = "Java"; String s4 = new String("Java");
		System.out.println("Equals method: "+s3.equals(s4));
		
		//.equalsIgnoreCase() method to checks the content of strings by ignoring the case
		String s5 = "python"; String s6 = "Python";
		System.out.println("IngnoreCase equals: "+s5.equalsIgnoreCase(s6));
		
		//== operator to checks the strings references, Return boolean
		System.out.println("Check References: "+s3 == s4);
		
		//.compareTo() to checks strings lexicographically, Returns int value
		String s7 = "ABC"; String s8 = "abc";
		System.out.println("CompareTo lexicogrpahically: "+s7.compareTo(s8));
		System.out.println("CompareTo IgnoreCase lexicogrpahically: "+s7.compareToIgnoreCase(s8));
		
		//(+) operator to concat strings 
		System.out.print(s3+s6);
		System.out.print("\t"+s3+10+20);
		System.out.print("\t"+10+20+s3);
		System.out.print("\t"+s3+10/2);
		System.out.println("\t"+s3+10*2);
		
		//.concat() to add strings
		System.out.println("Concating Strings: "+s3.concat(s6));
		
		//String.join(delimiter, sequences) to join strings using "," ";" ":" etc.
		System.out.println("Join Method to join strings: "+String.join(";", s3,s6));
		
		//.subSequence() method to return char sequence value
		String s9 = "This is Java programming";
		System.out.println("Sub Sequence: "+s9.subSequence(8, 20));
		
		//.substring() method to return sub string
		System.out.println("Sub String: "+s9.substring(8));
		System.out.println("Sub String: "+s9.substring(8, 20));
		
		//.replace() method to replace the substring
		String s10 = "This is demo";
		System.out.println("Replace: "+s10.replace("is", "was"));
		System.out.println("Replace First: "+s10.replaceFirst("is","was"));
		System.out.println("Replace All: "+s10.replaceAll("is(.)", "was"));
		System.out.println("Replace All: "+s10.replaceAll("is(.*)", "was"));
		System.out.println("Replace All: "+s10.replaceAll("\\s", "")); //remove spaces
		
		
		

	}

}
