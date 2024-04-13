package Collections;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.add(10);
		s.push("Kate");
		s.push('D');
		s.push(123.23);
		s.push(89);
		s.push(null);
		System.out.println(s);
		
		//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(s.peek());
		
		//Removes the object at the top of the stack and returns that object as the value of this function.
		System.out.println(s.pop());
		
		System.out.println(s.empty());
		
		//To find the position of the object, if not found it returns -1
		System.out.println(s.search("Kate"));
	}
}
