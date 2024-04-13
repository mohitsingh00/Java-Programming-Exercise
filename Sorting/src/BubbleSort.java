import java.util.Random;
public class BubbleSort {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] a = new int[6];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = ran.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(a);
		
		bubbleSort(a);
		System.out.println();
		
		System.out.println("\nAfter:");
		printArray(a);
	}
	
	private static void bubbleSort(int[] a)
	{
		for(int j = 0; j < a.length; j++)
		{
			for(int i = 0; i < a.length - 1; i++)
			{
				if(a[i] > a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;		
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
