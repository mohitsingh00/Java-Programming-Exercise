
public class StringSearchingMethods {

	public static void main(String[] args) {
		
		String s = "deepak";
		
		//It will start search from index 0
		System.out.println("Index of: "+s.indexOf("e"));
		
		//It will start search from the last index
		System.out.println("Last Index of: "+s.lastIndexOf("e"));
		
		//It starts searching the character at given index
		System.out.println("Char At: "+s.charAt(4));
		
		//It search the given character or string and returns boolean 
		System.out.println("Contains: "+s.contains("e"));
		System.out.println("Contains: "+s.contains("pa"));
		
		//Search the string first character
		System.out.println("Starts With: "+s.startsWith("d"));
		
		//Search the string last character
		System.out.println("Ends with: "+s.endsWith("k"));

	}

}
