import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import source.LeapYear;

class LeapYearTest {

	@Test
	void test() 
	{
		assertEquals("2000 should be a leap year", true, LeapYear.isLeapYear(2000));
		assertEquals("2004 should be a leap year", true, LeapYear.isLeapYear(2004));
        assertEquals("1900 should not be a leap year", false, LeapYear.isLeapYear(1900));
        assertEquals("2001 should not be a leap year", false, LeapYear.isLeapYear(2001));
	}

}
