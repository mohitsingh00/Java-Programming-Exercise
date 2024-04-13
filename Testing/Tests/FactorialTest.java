import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import source.RecFactorial;

class FactorialTest {

	
	//Clean Code
	@Test
	void test() 
	{
		assertEquals(24, RecFactorial.fact(4));
	}

	@Test
	void test1() 
	{
		int n = 3;
		int result = RecFactorial.fact(n);
		int excpected = 6;
		assertEquals(excpected, result);
	}

}
