
public class TypeConversion {

	public static void main(String[] args) {
		
		int a = 10;
		
		//Converting int value to string 
		String s1 = String.valueOf(a);
		System.out.println(s1);
		
		//Converting String into char array
		String s2 = "deepak";
		char[] c = s2.toCharArray();
		
		for(char a1:c)
		{
			System.out.print(a1+" ");
		}
		
	}
}
