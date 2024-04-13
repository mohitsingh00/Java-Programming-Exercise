package Collections;
import java.util.Vector;
public class Vector1 {

	public static void main(String[] args) {

		Vector v = new Vector(4); //Initial Capacity 10
		v.addElement(10);
		v.add("Adam");
		v.add(121.34);
		v.add('c');
		System.out.println(v.size());
		
		Vector v1= new Vector(3,10);
		v1.add(45);
		v1.add("Zack");
		v1.add(90.99);
		v1.add(null);
		v1.add(null);
		System.out.println(v1.capacity());
		
		//To find the element using index value
		System.out.println(v1.elementAt(3));
		System.out.println(v1.firstElement());
	}
}