import java.util.Arrays;
import java.util.Random;

public class SubArraySort {

	public static void main(String[] args) {

		/*
		 * Random ran = new Random();
		 * 
		 * int[] arr = new int[10];
		 * 
		 * for(int i = 0; i < arr.length; i++) { arr[i] = ran.nextInt(10); }
		 */

		int[] arr = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 };
		
		System.out.println("Before:");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + "  ");
		}

		// Sorting the subarray by passing the starting and ending index of subarray
		// How many elements it will sort = 4 - 2 = 2 elements
		Arrays.sort(arr, 2, 4);
		System.out.println();

		System.out.println("\nAfter:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

}
