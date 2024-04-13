package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Limit_Count {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,7,3,4,5,3,7);
		
		//distinct() to print unique elements
		List<Integer> n = num.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique elements are "+n);
		
		//count() to count the no. of elements
		long  count = num.stream().count();
		System.out.println("Total Elements: "+count);
		
		//limit() to capture limit no. of elements
		List<Integer> limit = num.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited elements are "+limit);
	}

}
