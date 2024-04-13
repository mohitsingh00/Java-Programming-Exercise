import java.util.function.Predicate;
public class Predicate3 {

	public static void main(String[] args) {

		int a [] = {5,10,15,20,25,30,35,40,45,50,55,60};
		
		Predicate<Integer> p = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 30;
		
		for(int n : a)
		{
			//if(p.or(p2).test(n))
			//if(p.test(n) && p2.test(n))
			if(p.and(p2).test(n))
			{
				System.out.println(n);
			}
		}
		
		//OR (Using "negate" -> it returns opposite of the result
		for(int n : a)
		{
			if(p.negate().test(n))
			{
				System.out.println(n);
			}
		}
	}
}
