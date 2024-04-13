import java.util.Random;

public class Quick {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = ran.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(num);
		
		quickSort(num);
		System.out.println();
		
		System.out.println("\nAfter:");
		printArray(num);

	}
	
	private static void quickSort(int[] num)
	{
		quickSort(num, 0, num.length - 1);
	}
	
	private static void quickSort(int[] array, int lowIndex, int highIndex)
	{
		if(array[lowIndex] > array[highIndex])
		{
			return;
		}
		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(array[leftPointer] <= pivot && leftPointer < rightPointer)
		{
			leftPointer++;
		}
		
		while(array[rightPointer] >= pivot && leftPointer < rightPointer)
		{
			rightPointer++;
		}
		swap(array, leftPointer, rightPointer);
		swap(array, leftPointer, highIndex);
		quickSort(array, lowIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, highIndex);
	}
	
	private static void swap(int[] array, int index1, int index2)
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	private static void printArray(int[] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i]+"  ");
		}
	}

}
