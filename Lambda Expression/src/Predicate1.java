import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {

		Predicate <Integer> p =  i-> i > 10; 
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		
		Predicate<String> p1 = s -> s.length() >= 5;
		System.out.println(p1.test("Welcome"));
		System.out.println(p1.test("Java"));
		
		String names [] = {"Dave", "Jimmy", "Jacob", "Mary", "Vishal"};
		for(String n : names)
		{
			if(p1.test(n))
			{
				System.out.print(n+" ");
			}
		}
	}

}
