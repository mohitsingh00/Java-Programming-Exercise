package Collections;
import java.util.ArrayList;
import java.util.HashSet;

public class HasSet1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("deepak");
		
		HashSet h  = new HashSet(al);
		h.add(50);
		h.add("Root");
		h.add(16.34);
		h.add('S');
		h.add(null);
		
		System.out.println(h);
	}

}
