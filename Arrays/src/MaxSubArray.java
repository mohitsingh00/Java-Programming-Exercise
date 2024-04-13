
public class MaxSubArray {

	public static void main(String[] args) {
		
		int a[] = {4,-2,-3,4,-1,-2,1,5,-3};
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0, end = 0, s = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
			
			if(sum > max)
			{
				max = sum;
				start = s;
				end = i;
			}
			if(sum < 0)
			{
				sum = 0;
				s = i+1;
			}
		}
		
		System.out.print("The max Sub Array is ");
		for(int i = start; i <= end; i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("The maximum sum of sub array is "+max);
		System.out.print("The max sub array starts from "+start+" index and end at "+end+" index");
	}

}
