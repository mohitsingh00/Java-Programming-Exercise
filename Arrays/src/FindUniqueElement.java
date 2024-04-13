
public class FindUniqueElement {

	public static void main(String[] args) {
		
		int[] a = {5,8,2,5,9,8,2,3,9,3,1};
		
		int res = a[0];
		for(int i = 1; i < a.length; i++)
		{
			res = res ^ a[i];
		}
		System.out.print("The Unique element is "+res);

	}

}
