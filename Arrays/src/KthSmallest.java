import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = ran.nextInt(100);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth smallest number: ");
		int k = sc.nextInt();
		
		int result = smallest(arr,k);
		System.out.println("\n\nThe "+k+" Largest Element: " + result);
	}
	
	private static int smallest(int[] arr, int k)
	{
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		//For removing the duplicates form array
		int j = 0;
		for(int i = 0; i < arr.length-1; i++)
		{
			if(arr[j] != arr[i+1])
			{
				arr[j] = arr[i];
				j++;
			}
		}
		//For storing the last element of array
		arr[j] = arr[arr.length-1];
		
		for(int i = 0; i <= j; i++)
		 { 
			 System.out.print(arr[i]+"  "); 
		 }
		
		if(j+1 >= k)
		{
			return arr[k-1];
		}
		else
		{
			System.out.println("\nArray does not have at least "+k+" unique elements.");
			return -1;
		}
	}

}
