
public class FindMissingElement {

	public static void main(String[] args) {
		
		//int a[] = {10,11,12,13,14,16,17};
		int a[] = {1,2,3,4,6};
		int exp_length = a.length + 1;
		int total = exp_length*(exp_length+1)/2;
		int sum = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.print("The missing element is "+(total-sum));

	}

}
