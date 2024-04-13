package Streams;
import java.util.Arrays;
import java.util.List;

public class Matches {

	public static void main(String[] args) {

		List<String> program = Arrays.asList("Java", "Python", "Hadoop", "C#", "C++", "Kotlin");
		
		//Any Match
		boolean match = program.stream().anyMatch(s -> s.contains("Python"));  
		System.out.println(match);
		
		//All Match
		match = program.stream().allMatch(s -> s.contains("Python"));  
		System.out.println(match);
		
		//None Match
		match = program.stream().noneMatch(s -> s.contains("Python"));  
		System.out.println(match);
	}
}
