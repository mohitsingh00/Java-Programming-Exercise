
public class DeleteElement {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60,70};
		
		int del_element = 30;
		delete(a,del_element);
	}
	private static void delete(int[] a, int del_element)
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(del_element == a[i])
			{
				for(int j = i; j < a.length-1; j++)
				{
					a[j] = a[j+1];	
				}
				count++;
				break;
			}
		}
		if(count == 0)
		{
			System.out.println("The element not found");
		}
		else
		{
			System.out.println("The element deleted Successfully");
		}
		 
		for(int i = 0; i < a.length-1; i++)
		{
			System.out.print(a[i]+"  ");
		}
		
	}

}
