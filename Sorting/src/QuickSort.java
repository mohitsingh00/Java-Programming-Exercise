import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] num = new int[100];
		
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
	
	private static void quickSort(int[] array)
	{
		quickSort(array, 0, array.length-1);
	}
	
	private static void quickSort(int[] array, int lowIndex, int highIndex)
	{
		//If there is only one element left on the highIndex it will return
		if(lowIndex >= highIndex)
		{
			return;
		}
		
		//int pivot = array[highIndex];
		//Here we are picking the random pivot from the list
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		
		//Here we swapping the random pivot value to the last index value so, that we can start sorting the list from last
		swap(array, pivotIndex, highIndex);
		
		//calling Partition method
		int leftPointer = Partition(array, lowIndex, highIndex, pivot);
		
		//Sorting the partitioned list
		quickSort(array, lowIndex, leftPointer-1);
		quickSort(array,leftPointer+1, highIndex);
	}

	private static int Partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer)
		{
			while(array[leftPointer] <= pivot && leftPointer < rightPointer)
			{
				leftPointer++;
			}
			while(array[rightPointer] >= pivot && leftPointer < rightPointer)
			{
				rightPointer--;
			}
			
			//calling the swap method
			swap(array, leftPointer, rightPointer);
		}
		
		//Here swapping the Pivot to its original position after the sorting
		swap(array, leftPointer, highIndex);
		return leftPointer;
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
