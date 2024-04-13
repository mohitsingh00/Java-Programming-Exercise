import java.util.Random;

public class Bubble {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = ran.nextInt(100);
		}
		
		System.out.print("Before:");
		printArray(a);
		
		bubbleSort(a);
		System.out.println();
		
		System.out.print("\nAfter:");
		printArray(a);

	}
	
	private static void bubbleSort(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	private static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}
	}

}
