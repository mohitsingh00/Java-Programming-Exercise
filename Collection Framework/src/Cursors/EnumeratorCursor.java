package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorCursor {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(23);
		v.add('A');
		v.add("Paul");
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+"  ");
		}
	}
}