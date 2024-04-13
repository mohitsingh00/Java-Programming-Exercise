package Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Min_Max {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(2,4,1,5,6,7,3);
		
		//'Integer::valueOf is a shorthand way of referring to the static method valueOf of the Integer class
		int n = num.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max value: "+n);
		
		int n1 = num.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min value: "+n1);
		
		// Get Min or Max String/Char
		String maxChar = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();
		System.out.println("Max Char: "+maxChar);
		 
		String minChar = Stream.of("H", "T", "D", "I", "J").min(Comparator.comparing(String::valueOf)).get();
		System.out.println("Min Char: "+minChar);
	}
}
