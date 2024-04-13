import java.util.function.Consumer;
public class Consumer3 {

	public static void main(String[] args) {

		Consumer<String> c1 = s->System.out.println(s+" is White.");
		Consumer<String> c2 = s->System.out.println(s+" has 4 legs.");
		Consumer<String> c3 = s->System.out.println(s+" is eating grass.");
		
		c1.accept("Cow"); c2.accept("Cow"); c3.accept("Cow");
		
		System.out.println("-------------------------------");
		
		c1.andThen(c2).andThen(c3).accept("Cow");
		
		System.out.println("-------------------------------");
		
		Consumer<String> c4 = c1.andThen(c2).andThen(c3);
		c4.accept("Cow");
	}
}
