//Using In-Build Binary Search Method

import java.util.Arrays;

public class BinarySearch3 {

	public static void main(String[] args) {
		
		int[] arr = {12, 21, 28,  38, 41, 48, 15, 64, 76, 32};
		int key = 38;
		
		Arrays.sort(arr);
		int result = Arrays.binarySearch(arr, key);
		
		if(result > 0)
		{
			System.out.println("Element "+key+" found at "+result);
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}
