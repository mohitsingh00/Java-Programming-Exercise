package Collections;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Paul");
		l.add(330.50);
		l.add('A');
		
		LinkedList l1 = new LinkedList(l);
		l1.add(23);
		l1.add("Jack");
		l1.add(231.20);
		l1.add('R');
		
		System.out.println(l1);
	}
}
