import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.print(s);
		c.accept("Java Programming");
	}

}
