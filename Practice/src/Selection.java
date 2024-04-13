import java.util.Random;

public class Selection {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = ran.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(a);
		
		long startTime = System.currentTimeMillis();
		
		selectionSort(a);
		System.out.println();
		
		long endTime = System.currentTimeMillis();
		System.out.print("\nTook "+(endTime - startTime)+" ms");
		
		System.out.println("\n\nAfter:");
		printArray(a);
	}

	private static void selectionSort(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			int min = i;
			int temp = a[i];
			for(int j = i+1; j < a.length; j++)
			{
				if(a[min] > a[j])
				{
					min = j;
				}
			}
			a[i] = a[min];
			a[min] = temp;
		
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
