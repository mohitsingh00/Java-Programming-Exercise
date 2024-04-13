@FunctionalInterface
interface Cab
{
	public void bookCab();
}
public class Test {

	public static void main(String[] args) {

		Cab c = ()-> System.out.println("Cab is Booked");
		c.bookCab();
	}
}
