
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StudentTests {
	static Student s = null;

	@Before
	public void setUp() throws Exception {
		s = new Student();
	}

	@Test
	public void testRight()  {
		s.setNumarCredite(10);
		s.setNumarMaterii(10);
		
		double actual = s.calculeazaMedieNumarCredite();
		double expected = 1;
		
		assertEquals ("verificare right", expected, actual, 0.01);
	}
	

	@Test(expected = ArithmeticException.class)
	public void testExceptie() {
		s.calculeazaMedieNumarCredite();
	}
	
	@Test (expected = ArithmeticException.class)
	public void testExistence() {
		s.setNumarCredite(0);
		s.calculeazaMedieNumarCredite();
	}

}
