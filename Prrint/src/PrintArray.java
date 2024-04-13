
public class PrintArray {

	public static void main(String[] args) {
		
		int []a = new int [3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		//Using For Loop
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ ", ");
		}
		
		//Using for each loop
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}
