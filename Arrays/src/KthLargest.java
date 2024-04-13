//This is not perfect program (Problems- Duplicate elements)
import java.util.Random;
import java.util.Scanner;

public class KthLargest {

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
		max(arr,k);

	}
	
	private static void max(int[] arr, int k)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			if(i == k-1)
			{
				System.out.println("\n\nThe "+k+"th largest number is "+arr[i]);
				break;
			}
			
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
	}

}
