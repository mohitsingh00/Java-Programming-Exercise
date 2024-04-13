import java.util.Random;
public class InsertionSort {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = ran.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(a);
		
		insertionSort(a);
		System.out.println();
		
		System.out.println("\nAfter:");
		printArray(a);
	}
	
	private static void insertionSort(int[] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			int temp = a[i];
			int j = i;
			while(j > 0 && a[j-1] > temp) 
			{
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
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
