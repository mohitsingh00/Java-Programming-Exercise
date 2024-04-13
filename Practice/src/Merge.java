import java.util.Random;
public class Merge {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = ran.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(a);
		
		mergeSort(a);
		System.out.println();
		
		System.out.println("\nAfter:");
		printArray(a);

	}
	
	private static void mergeSort(int[] a)
	{
		int length = a.length;
		
		if(length < 2)
		{
			return;
		}
		
		int midIndex = length / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[length - midIndex];
		
		for(int i = 0; i < midIndex; i++)
		{
			leftHalf[i] = a[i];
		}
		
		for(int i = midIndex; i < length; i++)
		{
			rightHalf[i - midIndex] = a[i];
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(a, leftHalf, rightHalf);
	}

	private static void merge(int[] a, int[] leftHalf, int[] rightHalf)
	{
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0,j = 0, k = 0;
		
		while(i < leftSize && j < rightSize)
		{
			if(leftHalf[i] <= rightHalf[j])
			{
				a[k] = leftHalf[i];
				i++;
			}
			else
			{
				a[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize)
		{
			a[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j < rightSize)
		{
			a[k] = rightHalf[j];
			j++;
			k++;
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
