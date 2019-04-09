package antpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {
	
	
	@BeforeClass
	public void setUp() {
		System.out.println("*** In class - Test A ***");
	}

	@Test
	public void testOne() {
		System.out.println("hello A One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("hello  B two");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("*** End of class***");
	}

}
