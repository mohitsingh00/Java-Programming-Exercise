import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KthLargest2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = ran.nextInt(100);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth largest number: ");
		int k = sc.nextInt();
		
        largest(arr,k);
    }

    // Step 4: Create a method to find the fourth largest element
    private static void largest(int[] arr, int k) 
    {
		
        // Step 6: Sort the array in ascending order
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();

		//To remove duplicates elements
        int rd = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
        	if(arr[rd] != arr[i+1])
        	{
        		arr[rd] = arr[i];
        		rd++;
        	}
        }
        arr[rd] = arr[arr.length-1];
        
		 for(int i = 0; i <= rd; i++)
		 { 
			 System.out.print(arr[i]+"  "); 
		 }
		 
        //rd+1 because rd is an index value
        // Step 8: Find the fourth largest element
        if (rd+1 >= k) 
        {
        	System.out.println("\n\nThe "+k+" Largest Element: " + arr[rd+1 - k]);
        }
        else 
        {
            System.out.println("\nArray does not have at least "+k+" unique elements.");
        }
    }
}
