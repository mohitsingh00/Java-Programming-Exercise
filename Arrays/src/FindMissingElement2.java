
public class FindMissingElement2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6};
		
		int XOR1 = a[0];
		
		//XOR all numbers in the given array
		for(int i = 1; i < a.length; i++)
		{
			XOR1 = XOR1 ^ a[i];
		}
		
		//XOR all numbers in range [0,n]
		int XOR2 = 1;
		for(int i = 2; i <= a.length+1; i++)
		{
			XOR2 = XOR2 ^ i;
		}
		System.out.println("The missing number is "+(XOR1 ^ XOR2));

	}

}
