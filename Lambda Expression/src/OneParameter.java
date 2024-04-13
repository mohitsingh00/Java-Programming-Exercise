@FunctionalInterface
interface Demo
{
	public void square(int a);
}

public class OneParameter {

	public static void main(String[] args) {

		//Here not using () for single parameter and changing the variable name
		Demo d = x -> System.out.println("Square of "+x+" is "+x*x);
		d.square(3);
	}

}
