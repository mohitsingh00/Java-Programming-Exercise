package Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2,5,7,3,9,1);
		List<Integer>num = l.stream().sorted().collect(Collectors.toList());
		System.out.println(num);
		
		List<Integer> num2 = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(num2);
		
		List<String> product = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan"); 
		List<String> s = product.stream().sorted().collect(Collectors.toList());
		System.out.println(s);
	}

}
