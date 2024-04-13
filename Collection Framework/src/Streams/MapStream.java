package Streams;
import java.util.Arrays;
import java.util.List;

public class MapStream {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("bus","scooter","car","auto","train");
		
		l.stream().map(name -> name.toUpperCase()).forEach(System.out :: println);
		
		List<Integer> l1 = Arrays.asList(2,3,4,5);
		l1.stream().map(num -> num*3).forEach(System.out :: println);
		
	}

}
