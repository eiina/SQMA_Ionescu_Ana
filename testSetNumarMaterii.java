
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class testSetNumarMaterii {
	static Student s= null;

	@Before
	public void setUp() throws Exception {
		s = new Student("Ion",30,10,10);
	}

	@Test
	public void testRight() {
		int nrMaterii = 10;
		s.setNumarMaterii(nrMaterii);
		assertEquals ("verificare right nrMaterii" ,nrMaterii, s.getNumarMaterii());
	}
	

	
	@Test
	public void testBoundaryMin(){
		s.setNumarMaterii(1);
		assertEquals("verificare boundaryMin", 1, s.getNumarMaterii());
	}

	@Test
	public void testBoundaryMax() {
		s.setNumarMaterii(20);
		assertEquals("verificare boundaryMax", 20, s.getNumarMaterii());
	}
	
	@Test 
	public void testCross(){
		int nr = 10;
		s.setNumarMaterii(nr);
		assertEquals(nr, s.getNumarMaterii());
	}
}
