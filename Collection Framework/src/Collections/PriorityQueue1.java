package Collections;
import java.util.PriorityQueue;
public class PriorityQueue1 {

	public static void main(String[] args) {

		PriorityQueue p = new PriorityQueue();
		p.offer(30);
		p.offer(10);
		p.offer(50);
		p.offer(20);
		p.offer(40);
		System.out.println(p);
		
		//Retrieves, but does not remove, the head of this queue
		System.out.println("View head of the queue: "+p.peek());  
		System.out.println("View head of the queue: "+p.element());
		
		//Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println("Removes the head of the queue: "+p.poll());   	
		System.out.println("Removes the head of the queue: "+p.remove());
	}
}
