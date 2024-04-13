import java.util.Random;

public class Insertion {

	public static void main(String[] args) {
	
		Random ran = new Random();
		int[] a = new int[6];
		
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
			while(j > 0 && temp < a[j-1])
			{
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
	}
	
	private static void printArray(int[] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i]+"  ");
		}
	}

}
