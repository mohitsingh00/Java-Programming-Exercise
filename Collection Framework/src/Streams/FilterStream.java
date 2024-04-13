package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterStream {

	public static void main(String[] args) {

		List<Integer> al  = Arrays.asList(5,10,15,20,25,30,35,40);
		
		List<Integer> evenNums = new ArrayList<>();
		evenNums = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNums);
		
		//Printing elements without creating new stream
		al.stream().filter(i -> i % 2 == 0).forEach(s-> System.out.print(s+" "));
		
		//OR
		al.stream().filter(i -> i % 2 == 0).forEach(System.out :: print);
		
		List<String> words = Arrays.asList("Jimmy", null, "Carluie", "Anderson", "Norti", null);
		List<String> result = words.stream().filter(w -> w != null).collect(Collectors.toList());
		System.out.println("\n"+result);

		//We don't need to create collection everytime we can use "stream.of"
		Stream.of("Akash", "Ben", "Amit", "Carl", "Arun").filter(s -> s.startsWith("A")).forEach(n->System.out.println(n));
	}
}