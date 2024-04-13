package Cursors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(10);
		l.add("Jason");
		l.add('C');
		
		System.out.println(l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
		
		
	}

}
