package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		//Initializing the arrayList with 5 capacity 
		ArrayList al = new ArrayList(20);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("deepak");
		
		//Addling all elements of "al" in "al2"
		ArrayList al2 = new ArrayList(al);
		al2.add(40);
		al2.add(50);
		al2.add("James");
		al2.add(50);
		al2.add(null);
		al2.add(null);
		
		System.out.println(al2);
		
		//Check if list contains the element or not
		System.out.println(al2.contains(20));
		
		//Reverse the arrayList
		System.out.println(al2.reversed());
		
		//Replacing the element
		al2.set(3, "Dean");
		System.out.println(al2);
		
		//Removing the element by providing Index value
		al2.remove(1);
		System.out.println(al2);
		
		//Removing the all the elements of "al" from "al2"
		al2.removeAll(al);
		System.out.println(al2);
		
		//Retrieve the element form "al2" by index
		System.out.println(al2.get(3));
		
		//Getting the size of an array
		System.out.println(al2.size());
		
		//To find the index value of element
		System.out.println(al2.indexOf("James"));
		
		//To remove all elements form al2
		al2.clear();
		System.out.println(al2);
	}

}
