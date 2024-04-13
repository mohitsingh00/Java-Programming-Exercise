package Cursors;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {

		List l1 = new ArrayList();
		l1.add(01);
		l1.add("Chris");
		l1.add('L');
		
		System.out.println("Printing whole object: "+l1);
		
		
		ListIterator li = l1.listIterator();
		
		//Moving Forward
		System.out.print("Printing elements one by one: ");
		while(li.hasNext())
		{
			System.out.print(li.next()+"  ");
		}
		
		System.out.println();
		
		//Moving Backward
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+"  ");
		}
		
	}

}
