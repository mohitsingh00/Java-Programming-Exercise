package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {

		List<String> Animal = Arrays.asList("Dog","Cat","Cow","Fox","Lion");
		List<String> Birds = Arrays.asList("Crow","Eagle","Sparrow","Parrot");
		
		Stream<String> s1 = Animal.stream();
		Stream<String> s2 = Birds.stream();
		
		List<String> result = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(result);
	}

}
