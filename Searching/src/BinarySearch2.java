//Using Recursion
public class BinarySearch2 {

	public static void main(String[] args) {
		
		int[] arr = {12, 15, 21, 28, 32, 38, 41, 48, 64, 76};
		int key = 38;
		int low = 0;
		int high = arr.length - 1;
		int result = search(arr, low, high, key);
		
		if(result == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element "+key+" found at index "+result);
		}

	}
	
	private static int search(int[] arr, int low, int high, int key)
	{
		int mid = (low + high) / 2;
		
		if(low <= high)
		{
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] > key)
			{
				return search(arr, low, mid-1, key);
			}
			else
			{
				return search(arr, mid+1, high, key);
			}
		}
		return -1;
	}

}
