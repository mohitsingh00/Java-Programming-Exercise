
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		//StringBuffer has default capacity to store string-> 16
		System.out.println("Default StringBuffer capacity: "+sb.capacity());

		//To set the capacity manually
		sb.ensureCapacity(100);
				
		//Now StringBuffer capacity has increased by adding more than 16 characters
		//To calculate "New Capacity" = (Old Capacity*2)+2 or (Old Capacity+1)*2
		sb.append("This is Java Programming");
		System.out.println("Increased StringBuffer capacity: "+sb.capacity());
		
		//To reduce the waste memory
		sb.trimToSize();
		System.out.println("After removing waste capacity: "+sb.capacity());
		
		//To concat string buffer value
		System.out.println("Concat in StringBuffer: "+sb.append(" Language"));
		
		//.equals() to compare references or memory address
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println("sb1 equals to sb2: "+sb1.equals(sb2));
		
		//Coz sb1 & sb2 pointing same memory address--> JavaLanguage
		StringBuffer sb3 = sb1.append("Language");
		System.out.println("sb1 equals to sb3: "+sb1.equals(sb3));
		
		//.indexOf() To find character at any index and start search from index 0
		System.out.println("'j' At index: "+sb.indexOf("J"));
		
		//.indexOf() To find character and search start from last index
		System.out.println("'m' At last index: "+sb.lastIndexOf("m"));
		
		//.inset(index,"character") to insert element
		System.out.println("Inset element: "+sb.insert(7, " an"));
		
		//.replace(startIndex, endIndex, "character") to replace element at any index
		System.out.println("Replace element: "+sb.replace(8, 10, "a"));
		
		//.substring(startIndex,endIndex) to print sub string
		System.out.println("Sub String: "+sb.substring(10, 26));
		
		//.setCharAt(index,char) to set the character at any index
		sb1.setCharAt(0, 'P');
		System.out.println("Set character the any Index: "+sb1);
		
		//.setLength() to set the length of string buffer
		sb1.setLength(4);
		System.out.println("Set the length to 4: "+sb1);
				
		//.reverse() to reverse the string
		System.out.println("To reverse string: "+sb.reverse());
		
		
		
		
		
	}

}
