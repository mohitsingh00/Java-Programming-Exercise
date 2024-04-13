import java.sql.Date;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date(2);
		System.out.println(s.get());
	}

}
