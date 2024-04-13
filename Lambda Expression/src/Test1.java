@FunctionalInterface
interface Cab1
{
	public String bookCab1(String source , String destination);
}
public class Test1 {

	public static void main(String[] args) {

		//Using {} if method contain multiple statements
		Cab1 c = (source, destination)-> 
		{
			System.out.println("Cab is Booked from "+source+" to "+destination);
			return ("Charges Rs 13,000");
		};
		
		System.out.println(c.bookCab1("Mumbai" , "Delhi"));
	}
}
