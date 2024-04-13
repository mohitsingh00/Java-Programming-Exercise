package Streams;
import java.util.Arrays;
import java.util.List;

public class ToArrays {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2,5,7,3,9,1);
		Object[] num = l.stream().toArray();
		
		for(Object n : num)
		{
			System.out.print(n+" ");
		}
	}

}
