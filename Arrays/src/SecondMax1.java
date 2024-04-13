import java.util.Random;

public class SecondMax1 {

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
		System.out.println("\n\nThe 2nd max element is "+max(arr));
	}
	
	private static int max(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int temp;
			for(int j = 0; j < arr.length-1; j++)
			{
				if(arr[i] > arr[j+1])
				{
					temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(i == 1)
			{
				break;
			}
		}
		return arr[1];
	}
}
