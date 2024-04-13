import java.util.Arrays;
import java.util.Random;

public class SecondMax2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = ran.nextInt(100);
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		max(arr);

	}
	private static void max(int[] arr)
	{
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		 for (int i = 1; i < arr.length; i++)
		 {
	            if (largest < arr[i])
	            {
	                secondLargest = largest;
	                largest = arr[i];
	            } 
	            else if (secondLargest < arr[i] && largest > arr[i]) 
	            {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("\n\nThe 2nd Largest element is "+secondLargest);

	    
	}

}
