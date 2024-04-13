import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = ran.nextInt(100);
		}
		
		System.out.println("Before:");
		printArray(num);
		
		mergeSort(num);
		System.out.println();
		
		System.out.println("\nAfter:");
		printArray(num);
		
	}
	
	private static void mergeSort(int[] inputArray)
	{
		int arrLength = inputArray.length;
		
		//This to check that if array is divided into single element or not
		if(arrLength < 2)
		{
			return;
		}
		
		//To divide the length of array into two parts
		int midIndex = arrLength / 2;
		
		//To set the size to left half array
		int[] leftHalf = new int [midIndex];
		//To set the size of right half array
		int[] rightHalf = new int [arrLength - midIndex];
		
		//Inserting elements into left half array from the imputArray
		for(int i = 0; i < midIndex; i++)
		{
			leftHalf[i] = inputArray[i];
		}
		
		//Inserting elements into right half array from the imputArray
		for(int i = midIndex; i < arrLength; i++)
		{
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(inputArray, leftHalf, rightHalf);
		
	}
	
	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf)
	{
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, j = 0, k = 0;
		
		while(i < leftSize && j < rightSize)
		{
			if(leftHalf[i] < rightHalf[j])
			{
				inputArray[k] = leftHalf[i];
				i++;
			}
			else
			{
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while (i < leftSize)
		{
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while (j < rightSize)
		{
			inputArray[k] = rightHalf[j];
			j++;
			k++;
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
