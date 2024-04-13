import java.util.Random;

public class MinElement {

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
		min(arr);
	}
	
	private static void min(int[] arr)
	{
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.print("\n\nThe min element is "+min);
	}

}
