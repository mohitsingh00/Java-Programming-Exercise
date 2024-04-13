import java.util.Arrays;
import java.util.Collections;

public class SortUsingArrayMethod {

	public static void main(String[] args) {
		
		int [] a = {12,34,1,23,5,23,15,65,25,64};
		
		//sorting to ascending order using sort method of Array class
		Arrays.sort(a); 
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		
		String [] c = {"zambia", "Australia", "Russia", "China", "Uganda", "France","Japan","Itly"};
		
		//sorting to ascending order using sort method of Array class
		Arrays.sort(c);
		System.out.print(Arrays.toString(c));
		
		//Java collection provide "reverseOrder()" method to sort the array in reverse-lexicographic order
		Arrays.sort(c, Collections.reverseOrder());
		System.out.print(Arrays.toString(c));
		

	}

}
