//Using Iteration method
public class BinarySearch1 {

	public static void main(String[] args) {
		
		int[] arr = {12, 15, 21, 28, 32, 38, 41, 48, 64, 76};
		int key = 38;
		int result = search(arr, key);
		
		if(result == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element "+key+" found at index "+result);
		}
	}
	
	private static int search(int[] arr, int key)
	{
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] > key)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		
		return -1;
	}

}
