package Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add(20);
		t.add(40);
		t.add(10);
		t.add(50);
		t.add(70);
		t.add(30);
		t.add(60);
		
		System.out.println(t);
		
		//Return the least element greater or equal to given element //25 -> 30
		System.out.println("The Greater element: "+t.ceiling(3));
		
		//Return the greater element less or equal to the given element //25 -> 20
		System.out.println("The least element: "+t.floor(21));
		
		//Return the elements less than given element
		System.out.println("Elements less than given element: "+t.headSet(40));
		
		//Return the least element greater than given element
		System.out.println("Greater Element: "+t.higher(20));
		
		//Return the greater element less than given element
		System.out.println("The lower Element: "+t.lower(30));
		
		//Return the element ranging from 'fromElement' to 'toElement' & toElement will not print
		System.out.println("SubSet: "+t.subSet(20, 40));
		
		//Return the elements greater than given element
		System.out.println("Greater Elements: "+t.tailSet(32));
		
		//Retrieves and removes the first (lowest) element,or returns null if this set is empty.
		System.out.println("Remove the lowest element: "+t.pollFirst());
		
		//Retrieves and removes the last (highest) element,or returns null if this set is empty
		System.out.println("Remove the greatest element: "+t.pollLast());
		
		//Return the reverse order of set
		System.out.println("Reverse Order: "+t.descendingSet());
		
		//Print element 1 by 1 in reverse order
		Iterator itr = t.descendingIterator();
		System.out.print("Descending Iterator: ");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"  ");
		}
	}
}