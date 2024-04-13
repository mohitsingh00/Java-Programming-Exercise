//This is Brute Force Method (Less efficient) 
public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] a = {3,5,1,6,6,9,3,7,7,12};
		
		System.out.print("Duplicates elements are ");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
			
		}
	}

}
