import java.util.function.Function;

public class Function3 {

	public static void main(String[] args) {

		Function <Integer,Integer> f1 = i -> i * 2;
		Function <Integer,Integer> f2 = i -> i * i * i;
		
		//First 2 will pass to the f1 then f1 result will pass to the f2
		System.out.println(f1.andThen(f2).apply(2));
		
		//First 2 will pass to the f2 then f2 result will pass to the f1
		System.out.println(f1.compose(f2).apply(2));
	}

}
