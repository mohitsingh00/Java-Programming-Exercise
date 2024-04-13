import java.util.Random;
public class MaxElement {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = ran.nextInt(100);
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		//Calling the max method;
		max(arr);	
	}
	
	private static void max(int[] arr)
	{
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("\n\nThe max element is "+max);
	}
}
