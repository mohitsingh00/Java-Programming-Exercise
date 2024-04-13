package Streams;
import java.util.Arrays;
import java.util.List;

public class Reduce2 {

	public static void main(String[] args) {

		 // Create a list of numbers either positive or negative  
        List<Integer> numbers = Arrays.asList(8, -4, 16, 0, 1, -6, 3);   
        
        // calculate sum of all the elements of the numbers array using the reduce method
        //Here 0 -> Identity and (firstEl, secondEl) -> Accumulator --> (Identity,Accumulator)
        int sumOfElements = numbers.stream().reduce(0, (firstElement, secondElement) -> firstElement + secondElement);
        
        // show the result returned by the reduce method  
        System.out.println("The sum of all elements of numbers array: " + sumOfElements);   
	}
}
