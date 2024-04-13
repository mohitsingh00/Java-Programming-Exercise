import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {

		Function <Integer,Integer> f = i -> i*i;
		System.out.println(f.apply(3));
		System.out.println(f.apply(2));
		
		Function <String,Integer> fn = s -> s.length();
		System.out.println(fn.apply("Java Programming"));
		System.out.println(fn.apply("Hello"));
	}
}
