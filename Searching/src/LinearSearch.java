
public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {10, 12, 15, 21, 32, 42, 64, 19};
		int key = 21;
		
		int result = search(arr, key);
		
		if(result == -1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element "+key+" is found at index "+result);
		}
	}
	
	private static int search(int[] arr, int key)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

}
